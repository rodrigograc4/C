import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.io.InputStream;

public class NoCloseInputStream extends InputStream {
    private final InputStream inputStream;

    public NoCloseInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public int read() throws IOException {
        return inputStream.read();
    }
}
