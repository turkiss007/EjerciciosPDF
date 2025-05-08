package DAM.PDFbasico;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class SaltoPagina {

	public static void main(String[] args) {
		try {
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream("src/main/resources/SaltoDePagina.pdf"));
			document.open();

			// Página 1
			Font titleFont = new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD);
			Paragraph titulo = new Paragraph("Este es el título de la primera página", titleFont);
			titulo.setAlignment(Element.ALIGN_CENTER);
			document.add(titulo);

			// Salto de página
			document.newPage();

			// Página 2
			Font listFont = new Font(Font.FontFamily.HELVETICA, 12);
			List lista = new List(List.ORDERED);

			lista.add(new ListItem("Primer elemento", listFont));
			lista.add(new ListItem("Segundo elemento", listFont));
			lista.add(new ListItem("Tercer elemento", listFont));
			lista.add(new ListItem("Cuarto elemento", listFont));
			lista.add(new ListItem("Quinto elemento", listFont));

			document.add(lista);

			document.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
