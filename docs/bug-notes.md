mkdir -p docs
cat << 'EOF' > docs/bug-notes.md
# Bug Notes - Ngày 14 (Exception & Array)

## Bug 01: Lỗi vượt biên chỉ số mảng (Off-by-one `index == length`)
- **Stack trace mẫu:**
  `java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2`
  `at com.qa.lab.SafeArrayReader.getElementSafely(SafeArrayReader.java:14)`
- **Nguyên nhân gốc (Root cause):** Mảng có độ dài `length = 2` chỉ có chỉ số hợp lệ `0` và `1`. Điều kiện kiểm tra biên viết sai thành `index <= items.length` (hoặc thiếu kiểm tra biên) khiến `index = 2` lọt qua và gây sập luồng.
- **Cách khắc phục:** Chặn ngay điều kiện `index < 0 || index >= items.length` và ném `IllegalArgumentException`, tuyệt đối không dùng `catch (Exception e)` để nuốt lỗi.
EOF

---

# Defect Notes - Ngày 15 (Mini Lab Phân Tích Luồng & Tái Hiện Lỗi)

## Defect 01: Sai số ngày tháng 2 năm tròn thế kỷ không chia hết cho 400 (Logic `if/else`)
- **Steps to Reproduce:**
  1. Khởi tạo đối tượng `BuggyLab`.
  2. Gọi hàm `daysInMonth(2, 1900)` (input tối thiểu: tháng `2`, năm `1900`).
- **Expected Result:** Trả về `28` (vì năm `1900` chia hết cho `100` nhưng không chia hết cho `400` nên không phải năm nhuận).
- **Actual Result:** Hàm trả về `29`.
- **Root cause giả thuyết:** Điều kiện kiểm tra năm nhuận chỉ kiểm tra `year % 4 == 0` mà thiếu điều kiện loại trừ năm chia hết cho `100` (`year % 100 != 0 || year % 400 == 0`).

## Defect 02: Thiếu phần tử cuối cùng khi tính tổng từ 1 đến n (Lỗi Off-by-one vòng lặp)
- **Steps to Reproduce:**
  1. Khởi tạo đối tượng `BuggyLab`.
  2. Gọi hàm `sumToN(1)` (input biên tối thiểu: `n = 1`).
- **Expected Result:** Trả về `1` (tổng các số nguyên từ `1` đến `1` bằng `1`).
- **Actual Result:** Hàm trả về `0`.
- **Root cause giả thuyết:** Điều kiện dừng của vòng lặp `for` viết sai toán tử biên `i < n` thay vì `i <= n`, làm vòng lặp dừng trước khi cộng phần tử cuối cùng `n`.

## Defect 03: Lỗi sập luồng khi truy cập vị trí `index == length` (Biên mảng & Exception)
- **Steps to Reproduce:**
  1. Khởi tạo mảng `String[] items = {"Java", "SQL"}` (`length = 2`).
  2. Gọi hàm `getItem(items, 2)` (input biên trên: `index = 2`).
- **Expected Result:** Ném ngoại lệ nghiệp vụ `IllegalArgumentException` với thông báo rõ ràng rằng chỉ số nằm ngoài phạm vi.
- **Actual Result:** Chương trình văng lỗi hệ thống `java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2`.
- **Root cause giả thuyết:** Điều kiện kiểm tra biên trên của mảng viết dư dấu bằng (`index <= items.length` thay vì `index >= items.length`), làm cho trường hợp `index == length` lọt qua cửa kiểm tra và đâm thẳng vào lệnh truy xuất mảng.