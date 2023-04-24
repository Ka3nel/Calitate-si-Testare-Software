package ro.ase.cts.AdapterClase.s09;

public class Main {

	public static void main(String[] args) {
		XmlParser xmlParser = new XmlParser();
		XmlToJsonAdapter jsonParser = new XmlToJsonAdapter(xmlParser);
		jsonParser.JsonParser("{ \"name\": \"John\", \"age\": 30 }");
	}

}
