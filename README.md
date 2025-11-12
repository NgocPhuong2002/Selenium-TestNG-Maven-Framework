# Xây dựng Framework kiểm thử tự động với Selenium WebDriver

## Giới thiệu

Đây là dự án xây dựng framework kiểm thử tự động cho ứng dụng web sử dụng Selenium WebDriver, Java, TestNG và Maven. Framework hỗ trợ kiểm thử tự động các chức năng cơ bản của website theo mô hình Page Object Model (POM).

## Tính năng chính

- Tự động hóa kiểm thử các chức năng như: đăng nhập, tìm kiếm, thêm sản phẩm vào giỏ hàng, thanh toán,...
- Tổ chức mã nguồn theo mô hình Page Object Model giúp dễ bảo trì và mở rộng.
- Quản lý và thực thi test suite bằng TestNG.
- Tích hợp Maven để quản lý thư viện, build và chạy test.
- Báo cáo kết quả kiểm thử chi tiết bằng TestNG Report.
- Dễ dàng mở rộng thêm test case mới hoặc cập nhật chức năng.

## Công nghệ sử dụng

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Git/GitHub

## Cấu trúc thư mục
├── .classpath
├── .project
├── .settings/
├── pom.xml               # File cấu hình Maven
├── README.md
├── src/                  # Thư mục chứa mã nguồn, bao gồm main/java & test/java theo chuẩn Maven
├── target/               # Thư mục build output do Maven sinh ra
├── test-output/          # Thư mục lưu báo cáo kết quả chạy TestNG
├── testng.xml            # File cấu hình TestNG Suite
