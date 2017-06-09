package cgt.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Uteis {
    
    public static Date formataData(String formato, String data) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(formato);
        return formatter.parse(data);
    }
}
