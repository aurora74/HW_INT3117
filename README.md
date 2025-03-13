# HW_INT3117

**Mô tả bài toán:** Xây dựng chương trình xác định học lực của học sinh dựa trên hai yếu tố:

1. Điểm trung bình (DTB): Là số nguyên trong khoảng [0, 10]
2. Số buổi nghỉ học (SBN): Là số nguyên không âm
3. Quy tắc xác định học lực:
   - Đặt DTB (Điểm trung bình)= x, SBN (Số buổi nghỉ) = y
   - Xuất sắc: x ≥ 8 và x ≤ 2
   - Giỏi: x ≥ 7 và x ≤ 5
   - Khá: y ≥ 5 và y ≤ 7
   - Không đạt: Không thuộc các trường hợp trên (x < 5 hoặc y > 7)
4. Đầu ra:
   - Trả về kết quả "**Xuất sắc**", "**Giỏi**", "**Khá**", hoặc “**Không đạt**”
   - Nếu dữ liệu đầu vào không hợp lệ, trả về “**Input không hợp lệ**”
