package pbj;

import java.net.URL;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Service;

import com.AMS360.WSAPI.www.v3_0.BasicHttpBinding_WSAPIServiceContractStub;
import com.AMS360.WSAPI.www.v3_0.DataContract.LoginRequest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws AxisFault
    {
        System.out.println( "Hello World!" );
        BasicHttpBinding_WSAPIServiceContractStub stub = new BasicHttpBinding_WSAPIServiceContractStub();
        
        stub.login(new LoginRequest(agencyNo, loginId, password, employeeCode));
    }
}
