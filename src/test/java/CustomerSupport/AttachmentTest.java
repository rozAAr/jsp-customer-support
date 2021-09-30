package CustomerSupport;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AttachmentTest {
	@Test void getNameIsEqual() {
        Attachment classUnderTest = new Attachment();
        Attachment classConstant = new Attachment();
        classConstant.setName("Test");
        String attachmentName = "Test";
        classUnderTest.setName(attachmentName);
        assertTrue(classUnderTest.getName() == classConstant.getName());
    }
    
    @Test void setNameReturnsNotNull() {
        Attachment classUnderTest = new Attachment();
        String attachmentName = "Test";
        classUnderTest.setName(attachmentName);
        assertNotNull(classUnderTest.getName(), "getName should return a non null");
    }
    
	@Test void getContentIsEqual() {
        Attachment classUnderTest = new Attachment();
        Attachment classConstant = new Attachment();
        byte[] aa = {(byte)0x03, (byte)0x00, (byte)0x00, (byte)0x00};
        classUnderTest.setContents(aa);
        classConstant.setContents(aa);
        assertTrue(classUnderTest.getContents() == classConstant.getContents());
    }
    
    @Test void setContentsReturnsNotNull() {
        Attachment classUnderTest = new Attachment();
        byte[] aa = {(byte)0x03, (byte)0x00, (byte)0x00, (byte)0x00};
        classUnderTest.setContents(aa);
        assertNotNull(classUnderTest.getContents(), "getContents should return a non null");
    }
}
