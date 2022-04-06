package cat.paucasesnoves.Utilitats;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class Errors {

    public enum TipusError {
        Error("Se ha detectado un error que no afecta a el estado del programa", 0),
        ErrorGrave("Error potencialmente peligroso posible crash", 1),
        ErrorFatal("Error Fatal cierre del programa en 3,2,1...", -1);

        private static final Map<Integer, TipusError> lookup = new HashMap<Integer, TipusError>();

        static {
            for(TipusError s : EnumSet.allOf(TipusError.class))
                lookup.put(s.getCode(), s);
        }

        private final String message;
        private final int code;

        private TipusError(String message, int code) {
            this.message = message;
            this.code = code;

        }

        public int getCode() { return code; }
        public String getMessage() { return message; }

        public static TipusError get(int code) {
            return lookup.get(code);
        }
    }
}
