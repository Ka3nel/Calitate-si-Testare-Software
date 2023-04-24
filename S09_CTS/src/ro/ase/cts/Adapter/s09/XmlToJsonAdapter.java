package ro.ase.cts.Adapter.s09;

public class XmlToJsonAdapter implements JsonParser {
	private XmlParser xmlParser;
	
	public XmlToJsonAdapter(XmlParser xmlParser) {
		this.xmlParser = xmlParser;
	}

	@Override
	public void parseJson(String json) {
		String xml = convertJsonToXml(json);
		xmlParser.parseXml(xml);
	}
	
	private String convertJsonToXml(String json) {
		// code to convert JSON to XML
		return json;
	}
}
