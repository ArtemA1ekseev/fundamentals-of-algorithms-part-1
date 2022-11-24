package com.skypro.fundamentalsofalgorithms;

import com.skypro.fundamentalsofalgorithms.array.StringListImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringListImplTest {

    private StringListImpl stringList;

    @BeforeEach
    public void setUp(){
        this.stringList = new StringListImpl(10);
        Stream.of(
                stringList.add(0,"Test1"),
                stringList.add(1,"Test2"),
                stringList.add(2,"Test3")
        ).forEach(stringList::add);
    }

    @Test
    public void shouldReturnAddItemsSuccess() {
        String request = stringList.add(1,"Valid");
        String result = stringList.add(request);
        Assertions
                .assertThat(stringList.add(request))
                .contains(result);
    }

    @Test
    public void removeItems() {
        stringList.remove(2);
        Assertions.assertThat(stringList.size());
    }

}
