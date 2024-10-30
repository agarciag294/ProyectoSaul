package Controladores;

import com.thoughtworks.xstream.converters.SingleValueConverter;

public class NullDoubleConverter implements SingleValueConverter {

    @Override
    public boolean canConvert(Class type) {
        return Double.class.isAssignableFrom(type);
    }

    @Override
    public String toString(Object obj) {
        return obj == null ? "null" : obj.toString();
    }

    @Override
    public Object fromString(String str) {
        return "null".equalsIgnoreCase(str) ? null : Double.parseDouble(str);
    }
}

