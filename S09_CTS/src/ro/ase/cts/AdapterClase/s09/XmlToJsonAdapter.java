package ro.ase.cts.AdapterClase.s09;

public class XmlToJsonAdapter implements Parser {
	private XmlParser xmlParser;
	private JsonParser jsonParser;
	
	public XmlToJsonAdapter(XmlParser xmlParser) {
		this.xmlParser = xmlParser;
	}
	
	public XmlToJsonAdapter(JsonParser jsonParser) {
		this.jsonParser = jsonParser;
	}

	@Override
	public void JsonParser(String json) {
		String xml = convertJsonToXml(json);
		xmlParser.parseXml(xml);
	}

	@Override
	public void XmlParser(String xml) {
		String json = convertXmlToJson(xml);
		jsonParser.parseJson(json);
	}
	
	private String convertJsonToXml(String json) {
		// code to convert JSON to XML
		return json;
	}
	
	private String convertXmlToJson(String xml) {
		// code to convert JSON to XML
		return xml;
	}
}
