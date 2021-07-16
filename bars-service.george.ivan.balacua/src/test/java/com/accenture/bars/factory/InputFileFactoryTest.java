package com.accenture.bars.factory;

import com.accenture.bars.file.AbstractInputFile;
import com.accenture.bars.file.TextInputFileImpl;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class InputFileFactoryTest {


        @BeforeAll
        @AfterAll
        @Test
        public void testGetInstance() {
            InputFileFactory factory = InputFileFactory.getInstance();
            assertTrue(factory instanceof InputFileFactory);
        }
        @Test
        public void testGetInputFileTxt() {
            InputFileFactory factory = InputFileFactory.getInstance();
            File file = new File("\\Users\\george.ivan.balacua\\Downloads\\BARS Service Materials v3.0\\BARS_TEST");
            AbstractInputFile txtInputFile = factory.getInputFile(file);
            assertTrue(txtInputFile instanceof TextInputFileImpl);
        }
    }

