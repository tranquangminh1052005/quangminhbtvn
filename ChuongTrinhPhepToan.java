/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chuongtrinhpheptoan;

import java.util.Scanner;


public class Chuongtrinhpheptoan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập hai số nguyên từ bàn phím
        System.out.print("Nhap so nguyen thu nhat: ");
        int so1 = scanner.nextInt();
        System.out.print("Nhap so nguyen thu hai: ");
        int so2 = scanner.nextInt();

        // Thực hiện các phép toán và in kết quả
        int tong = so1 + so2;
        int hieu = so1 - so2;
        int tich = so1 * so2;
        int thuong = so1 / so2; 
        int du = so1 % so2;

        System.out.println("Tong: " + tong);
        System.out.println("Hieu: " + hieu);
        System.out.println("Tich: " + tich);
        // Kiểm tra để tránh lỗi chia cho 0
        if (so2 != 0) {
            System.out.println("Thuong: " + thuong);
            System.out.println("Du: " + du);
        } else {
            System.out.println("Loi: Khong the chia cho 0");
        }
    }
}
