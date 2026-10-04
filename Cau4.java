import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class CongNhan {
    private int stt;
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private double luong;
    private String chucVu;

    public CongNhan(int stt, String hoTen, String ngaySinh, String diaChi, double luong, String chucVu) {
        this.stt = stt;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.luong = luong;
        this.chucVu = chucVu;
    }

    public int getStt() {
        return stt;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public double getLuong() {
        return luong;
    }

    public String getChucVu() {
        return chucVu;
    }
}

public class Cau4 extends JFrame {
    private final List<CongNhan> danhSach = new ArrayList<>();
    private final DefaultTableModel model;

    public Cau4() {
        setTitle("Quan ly cong nhan");
        setSize(850, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        taoDuLieu();

        String[] columns = {
                "STT", "Ho va ten", "Ngay sinh", "Dia chi", "Luong", "Chuc vu"
        };

        model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);

        hienThiDanhSach();

        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    private void taoDuLieu() {
        danhSach.add(new CongNhan(1, "Nguyen Van An", "12/03/2000", "Ha Noi", 12000000, "To truong"));
        danhSach.add(new CongNhan(2, "Tran Thi Binh", "25/07/2001", "Ha Noi", 11000000, "Cong nhan"));
        danhSach.add(new CongNhan(3, "Le Van Cuong", "08/11/1999", "Bac Ninh", 13000000, "To truong"));
        danhSach.add(new CongNhan(4, "Pham Thi Dung", "16/01/2002", "Hung Yen", 10500000, "Cong nhan"));
    }

    private void hienThiDanhSach() {
        danhSach.sort(Comparator.comparing(CongNhan::getHoTen));

        for (CongNhan cn : danhSach) {
            model.addRow(new Object[]{
                    cn.getStt(),
                    cn.getHoTen(),
                    cn.getNgaySinh(),
                    cn.getDiaChi(),
                    cn.getLuong(),
                    cn.getChucVu()
            });
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Cau4 frame = new Cau4();
            frame.setVisible(true);
        });
    }
}
