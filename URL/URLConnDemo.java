/**URL（Uniform Resource Locator）中文名为统一资源定位符，有时也被俗称为网页地址
表示为互联网上的资源，如网页或者FTP地址.URL可以分为如下几个部分:
protocol://host:port/path?query#fragment
protocol(协议)可以是 HTTP、HTTPS、FTP 和 File，port 为端口号，path为文件路径及文件名
URL 解析：

    协议为(protocol)：http
    主机为(host:port)：www.runoob.com
    端口号为(port): 80 ，以上URL实例并未指定端口，因为 HTTP 协议默认的端口号为 80。
    文件路径为(path)：/index.html
    请求参数(query)：language=cn
    定位位置(fragment)：j2se，定位到网页中 id 属性为 j2se 的 HTML 元素位置 


*/
import java.net.*;
import java.io.*;
public class URLConnDemo
{
   public static void main(String [] args)
   {
      try
      {
         URL url = new URL("http://www.runoob.com");
         URLConnection urlConnection = url.openConnection();
         HttpURLConnection connection = null;
         if(urlConnection instanceof HttpURLConnection)
         {
            connection = (HttpURLConnection) urlConnection;
         }
         else
         {
            System.out.println("请输入 URL 地址");
            return;
         }
         BufferedReader in = new BufferedReader(
         new InputStreamReader(connection.getInputStream()));
         String urlString = "";
         String current;
         while((current = in.readLine()) != null)
         {
            urlString += current;
         }
         System.out.println(urlString);
      }catch(IOException e)
      {
         e.printStackTrace();
      }
   }
}

