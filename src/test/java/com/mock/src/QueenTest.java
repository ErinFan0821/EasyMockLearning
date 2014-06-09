package com.mock.src;

import org.junit.Before;
import org.junit.Test;

import static org.easymock.EasyMock.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by techops on 4/9/14.
 */
public class QueenTest {
    private Knight mock;
    private Queen queen;

    @Before
    public void setUp() throws Exception {
        queen = new Queen();
        mock = createMock(Knight.class);
        queen.set(mock);
    }

    @Test
    public void should_return_void() throws Exception {
        mock.ImVoid();

        replay(mock);
        queen.callVoidFunc();
        verify(mock);
    }

    @Test
    public void should_return_string() throws Exception {
        expect(mock.returnString()).andReturn("Hello");

        replay(mock);
        String ret = queen.callStringFunc();
        verify(mock);

        assertThat(ret, is("Hello"));
    }

    @Test(expected = Exception.class)
    public void should_throw_exception(){
        expect(mock.willThrowException()).andThrow(new Exception());

        replay(mock);
        queen.callExceptionFunc();
        replay(mock);
    }

    @Test
    public void should_() throws Exception {

    }
}
