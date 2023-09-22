package kp;

import com.facebook.presto.common.function.SqlFunctionProperties;
import com.facebook.presto.common.type.StandardTypes;
import com.facebook.presto.spi.function.Description;
import com.facebook.presto.spi.function.ScalarFunction;
import com.facebook.presto.spi.function.SqlNullable;
import com.facebook.presto.spi.function.SqlType;
import com.facebook.presto.spi.function.TypeParameter;
import io.airlift.slice.Slice;

public class GetSquare {
    @ScalarFunction(value = "get_square", calledOnNullInput = true)
    @Description("Returns sqaure of an integer input")
    @SqlType(StandardTypes.BIGINT)
    public static long isIntParam(@SqlNullable @SqlType(StandardTypes.BIGINT) Long value)
    {
        if(value == null) {
            return 0L;
        }
        else {
            return (value * value);
        }
    }
}
