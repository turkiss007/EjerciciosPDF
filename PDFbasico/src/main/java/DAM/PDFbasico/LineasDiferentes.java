package DAM.PDFbasico;

import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class LineasDiferentes {

	public static void main(String[] args) {

		try {
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream("src/main/resources/LineasDiferentes.pdf"));
			document.open();

			Font boldFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
			Paragraph linea1 = new Paragraph("La práctica constante mejora cualquier habilidad.", boldFont);

			Font italicFont = new Font(Font.FontFamily.HELVETICA, 12, Font.ITALIC);
			Paragraph linea2 = new Paragraph("Soñar en grande es el primer paso para lograrlo.", italicFont);

			Font courierFont = new Font(Font.FontFamily.COURIER, 12);
			Paragraph linea3 = new Paragraph("El error es parte esencial del aprendizaje.", courierFont);

			Font purpleFont = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL, new BaseColor(128, 0, 128));
			Paragraph linea4 = new Paragraph("La tecnología transforma ideas en realidades.", purpleFont);

			Font largeFont = new Font(Font.FontFamily.HELVETICA, 18);
			Paragraph linea5 = new Paragraph("Cada línea de código cuenta una historia.", largeFont);

			// Agregar párrafos al documento
			document.add(linea1);
			document.add(linea2);
			document.add(linea3);
			document.add(linea4);
			document.add(linea5);

			document.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
