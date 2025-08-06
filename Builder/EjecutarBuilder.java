public class EjecutarBuilder {

    public static void main(String[] args){

        Converter objConvASCII = new ASCIIConverter();
        Converter objConvPS = new PostScriptConverter();
        Converter objConvPDF = new PDFConverter();

        Reader objLector1 = new Reader(objConvASCII);

        objLector1.parseInput("LINEA");
        objLector1.parseInput("PARRAFO");

        Reader objLector2 = new Reader(objConvPDF);

        objLector2.parseInput("TABLA");
        objLector2.parseInput("PARRAFO");

        Reader objLector3 = new Reader(objConvPS);

        objLector3.parseInput("TABLA");
        


    }
}