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