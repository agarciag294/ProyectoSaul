package Controladores;

import com.thoughtworks.xstream.converters.SingleValueConverter;

public class NullIntegerConverter implements SingleValueConverter {

    @Override
    public boolean canConvert(Class type) {
        return Integer.class.isAssignableFrom(type);
    }

    @Override
    public String toString(Object obj) {
        return obj == null ? "null" : obj.toString();
    }

    @Override
    public Object fromString(String str) {
    	return "null".equalsIgnoreCase(str) ? null : Integer.parseInt(str);
    }
}

