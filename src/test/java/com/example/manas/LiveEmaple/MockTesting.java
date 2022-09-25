package com.example.manas.LiveEmaple;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.manas.LiveEmaple.basic.Hello;
import com.example.manas.LiveEmaple.basic.SomeBusiness;

/*Author:Manas Vishnoi
 * We are trying to make mock tests with best practices
 */

@ExtendWith(MockitoExtension.class)    /*use @RunWith(MockitoJunitRunner.class) with Junit4*/
class MockTesting {
	
	/*Declaring objects we will need*/
	@InjectMocks
	private Hello hello; /*we were using Hello hello = new Hello(); instead of @InjectMocks */
	
	@Mock
	private SomeBusiness smb ; /*we were using SomeBusiness smb= Mock(SomeBusiness.class) instead of @Mock */
	
	@Test
	public void test() {
		when(smb.retrieveAll()).thenReturn(new int[] {1,2,3,4}).thenReturn(new int[] {1,2,3,5}).
		thenReturn(new int[] {2,3,4,5} );
		hello.setSomeBusiness(smb);
		assertEquals(hello.AddValue(),10);
		assertEquals(hello.AddValue(),11);
		assertEquals(hello.AddValue(),14);
	}
	
	@Test
	public void Test_1() {
		when(smb.retrieveString()).thenReturn("I am Joker");
		
		hello.setSomeBusiness(smb);
		String actualValue = hello.getLowecase();
		String ExpectedValue= "i am joker";
		assertEquals(actualValue,ExpectedValue);
	}
	
	@Test
	public void Test_2(){
		when(smb.retrieveAll()).thenReturn(new int[] {1,2,4});
		hello.setSomeBusiness(smb);
		int n= hello.AddValue();
		int n1=7;
		assertEquals(n,n1);
		
	}

}
