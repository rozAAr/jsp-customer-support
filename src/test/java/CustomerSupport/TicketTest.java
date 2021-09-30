package CustomerSupport;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TicketTest {
    @Test void getCustomerNameIsEqual() {
        Ticket classUnderTest = new Ticket();
        Ticket classConstant = new Ticket();
        classConstant.setCustomerName("Test");
        String custName = "Test";
        classUnderTest.setCustomerName(custName);
        assertTrue(classUnderTest.getCustomerName() == classConstant.getCustomerName());
    }
    
    @Test void setCustomerNameReturnsNotNull() {
        Ticket classUnderTest = new Ticket();
        String custName = "Test";
        classUnderTest.setCustomerName(custName);
        assertNotNull(classUnderTest.getCustomerName(), "getCustomerName should return a non null");
    }
    
    @Test void getSubjectIsEqual() {
        Ticket classUnderTest = new Ticket();
        Ticket classConstant = new Ticket();
        classConstant.setSubject("Test");
        String subjectName = "Test";
        classUnderTest.setSubject(subjectName);
        assertTrue(classUnderTest.getSubject() == classConstant.getSubject());
    }
    
    @Test void setSubjectReturnsNotNull() {
        Ticket classUnderTest = new Ticket();
        String custName = "Test";
        classUnderTest.setSubject(custName);
        assertNotNull(classUnderTest.getSubject(), "getSubject should return a non null");
    }
    
    @Test void getBodyIsEqual() {
        Ticket classUnderTest = new Ticket();
        Ticket classConstant = new Ticket();
        classConstant.setBody("Test");
        String bodyName = "Test";
        classUnderTest.setBody(bodyName);
        assertTrue(classUnderTest.getBody() == classConstant.getBody());
    }
    
    @Test void setBodyReturnsNotNull() {
        Ticket classUnderTest = new Ticket();
        String bodyName = "Test";
        classUnderTest.setBody(bodyName);
        assertNotNull(classUnderTest.getBody(), "getBody should return a non null");
    }
    
    @Test void getAttachmentReturnsNotNull() {
    	Ticket classUnderTest = new Ticket();
        Attachment attachmentTest = new Attachment();
        attachmentTest.setName("attachmentTest");
        classUnderTest.addAttachment(attachmentTest);
        assertNotNull(classUnderTest.getAttachment("attachmentTest"));
    }
    
    @Test void addAttachmentReturnsOne() {
    	Ticket classUnderTest = new Ticket();
        Attachment attachmentTest = new Attachment();
        classUnderTest.addAttachment(attachmentTest);
        assertTrue(classUnderTest.getNumberOfAttachments() == 1);
    }
    
    @Test void getAttachmentsReturnsNotNull() {
    	Ticket classUnderTest = new Ticket();
        Attachment attachmentTest = new Attachment();
        classUnderTest.addAttachment(attachmentTest);
        assertNotNull(classUnderTest.getAttachments());
    }
    
    @Test void getNumberOfAttachmentsIsEqual() {
    	Ticket classUnderTest = new Ticket();
        Attachment attachmentTest = new Attachment();
        classUnderTest.addAttachment(attachmentTest);
        assertTrue(classUnderTest.getNumberOfAttachments() == 1);
    }
}
