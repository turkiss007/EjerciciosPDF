package DAM.PDFbasico;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Hola_Mundo_PDF {

	public static void main(String[] args) {
		try {

			// Crear documento
			Document document = new Document();

			// Ubicación del documento
			PdfWriter.getInstance(document, new FileOutputStream("src/main/resources/HolaMundo.pdf"));
			document.open();

			// Nuevo párrafo
			Paragraph titulo = new Paragraph("Hola Mundo");
			titulo.setAlignment(Element.ALIGN_CENTER);

			document.add(titulo);
			document.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
