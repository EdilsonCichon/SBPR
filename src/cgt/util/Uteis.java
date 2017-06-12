package cgt.util;

import java.util.Date;
import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public abstract class Uteis {
    
    public static Date formatarData(String formato, String data) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(formato);
        return formatter.parse(data);
    }
    
    public static Date getDataAtual() {
        return Calendar.getInstance().getTime();
    }
}
