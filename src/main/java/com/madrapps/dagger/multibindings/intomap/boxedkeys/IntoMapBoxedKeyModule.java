package com.madrapps.dagger.multibindings.intomap.boxedkeys;

import com.madrapps.dagger.models.Cycle;
import com.madrapps.dagger.models.Train;
import com.madrapps.dagger.models.Truck;
import com.madrapps.dagger.models.Vehicle;
import com.madrapps.dagger.multibindings.intomap.boxedkeys.enums.MyKey;
import com.madrapps.dagger.multibindings.intomap.boxedkeys.enums.VehicleType;
import com.madrapps.dagger.multibindings.intomap.boxedkeys.enums.VehicleTypeKey;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.*;

import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@Module
public class IntoMapBoxedKeyModule {

    @Provides
    @IntoMap
    @IntKey(1)
    Vehicle provide1() {
        return new Truck();
    }

    @Provides
    @IntoMap
    @IntKey(2)
    Vehicle provide2() {
        return new Train();
    }

    @Provides
    @IntoMap
    @LongKey(3)
    Vehicle provide3() {
        return new Train();
    }

    @Provides
    @IntoMap
    @LongKey(4)
    Vehicle provide4() {
        return new Truck();
    }

    @Provides
    @IntoMap
    @ClassKey(Integer.class)
    Vehicle provide5() {
        return new Truck();
    }

    @Provides
    @IntoMap
    @ClassKey(String.class)
    Vehicle provide6() {
        return new Cycle();
    }

    @Provides
    @IntoMap
    @VehicleTypeKey(VehicleType.TRUCK)
    Vehicle provide7() {
        return new Truck();
    }

    @Provides
    @IntoMap
    @VehicleTypeKey(VehicleType.TRAIN)
    Vehicle provide8() {
        return new Cycle();
    }

    @Provides @IntoMap
    @MyKey(name = "abc", implementingClass = Integer.class, thresholds = {1, 5, 10})
    static String provideAbc1510Value() {
        return "foo";
    }

    @Provides @IntoMap
    @MyKey(name = "def", implementingClass = Long.class, thresholds = {1, 2, 3})
    static String provideDef1510Value() {
        return "bar";
    }

    @Provides @IntoSet
    static Map.Entry<String, Vehicle> entryOne() {
        String key = "Train";
        Vehicle value = new Train();
        return new AbstractMap.SimpleImmutableEntry(key, value);
    }

    @Provides @IntoSet
    static Map.Entry<String, Vehicle> entryTwo() {
        String key = "Truck";
        Vehicle value = new Truck();
        return new AbstractMap.SimpleImmutableEntry(key, value);
    }

    @Provides
    static Map<String, Vehicle> stringVehicleMap(Set<Map.Entry<String, Vehicle>> entries) {
        Map<String, Vehicle> map = new LinkedHashMap<>(entries.size());
        for (Map.Entry<String, Vehicle> entry : entries) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }
}
