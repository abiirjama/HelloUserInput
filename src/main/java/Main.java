import static input.InputUtils.stringInput;

public class Main {
    public static void main(String[] args) {

        String email = stringInput("Enter your email");
        double bookPrice = 40;
        double discount = 0;

        if (email.endsWith(".edu")) {
            System.out.println("Your student email is " + email);
            discount = 10;
        }

        System.out.println(email);


        bookPrice = bookPrice / 100 * (100 - discount);
        System.out.println(bookPrice);
    }

    public static void printBookList(String[] books) {
        for (int x = 0; x < books.length; x++) { // Döngü sayacının kapsamı
            String book = books[x]; // Mevcut kitap adı alınır

            // Uzun kitap adlarını kısalt
            if (book.length() > 50) {
                book = book.substring(0, 50) + "..."; // Kitap adı 50 karakteri geçerse kısaltılır
            }

            System.out.println(x + 1 + "';" + book); // Kitap numarası ve adı yazdırılır
        }

        // x burada var mı? - Hayır
        // book burada var mı? - Hayır
        // books burada var mı? - Evet
        System.out.println(books); // Kitap listesi yazdırılır
    }
}
