package kp;

import com.facebook.presto.spi.Plugin;
import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class GetSquarePlugin implements Plugin{

    @Override
    public Set<Class<?>> getFunctions() {
        return ImmutableSet.<Class<?>>builder()
                .add(GetSquare.class)
                .build();
    }

}
