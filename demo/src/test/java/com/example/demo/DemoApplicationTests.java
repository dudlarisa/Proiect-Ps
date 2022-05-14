package com.example.demo;

import com.example.demo.exemplu.Angajat;
import com.example.demo.model.BasicUser;
import com.example.demo.exemplu.DataSource;
import com.example.demo.model.Administrator;
import com.example.demo.model.EnumUser;
import com.example.demo.model.FactoryUser;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static com.example.demo.exemplu.User.angajat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
/*
@SpringBootTest
class DemoApplicationTests {

	@Mock
	DataSource dataSourceMock;

	@Test
	void contextLoads() {
		FactoryUser userFactory=new FactoryUser();
		BasicUser userBasic=userFactory.makeUser(angajat);
		Angajat angajatUser=new Angajat(null,null);
		assertEquals(angajatUser, userBasic);

	}

	@Test
	void test2() {


		when(dataSourceMock.zile()).thenReturn(15);

		FactoryUser userFactory=new FactoryUser();
		BasicUser userBasic=userFactory.makeUser(angajat);

		userBasic.data=dataSourceMock;

		int result =userBasic.zile();
		//assertEquals(156, result);
		//assertEqual
				verify(dataSourceMock,times(1)).zile();

	}

}
*/
/**
 * Testing class.
 */
@SpringBootTest
class DemoApplicationTests {

	//@Mock
	//BasicUser basicUser1;
	//BasicUser basicUser2;

	/**
	 *
	 */
	@Test
	public void createAdminTest(){

		FactoryUser userFactory = new FactoryUser("Popa","Raul","0729304567","poparaul@gmail.com","poparaul","raulp");
		BasicUser basicUser1 = userFactory.createUser(EnumUser.Administrator);
		Administrator admin = new Administrator("Popa","Raul","0729304567","poparaul@gmail.com","poparaul","raulp");
		assertEquals( admin.getUsername(), basicUser1.getUsername());
		assertEquals( admin.getEmail(), basicUser1.getEmail());
		assertEquals (admin.getNume(), basicUser1.getNume());
		assertEquals( admin.getPrenume(), basicUser1.getPrenume());
		assertEquals( admin.getPassword(), basicUser1.getPassword());
		assertEquals( admin.getTelefon(), basicUser1.getTelefon());

	}

}
