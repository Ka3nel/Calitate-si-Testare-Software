package ro.ase.cts.Adapter.s09;

public class Main {

	public static void main(String[] args) {
		XmlParser xmlParser = new XmlParser();
		JsonParser jsonParser = new XmlToJsonAdapter(xmlParser);
		jsonParser.parseJson("{ \"name\": \"John\", \"age\": 30 }");
	}

}
