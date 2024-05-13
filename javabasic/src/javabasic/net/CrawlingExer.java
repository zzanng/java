package javabasic.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

/*
 * 웹크롤링 실습)
 * 개요 : 쇼핑몰에서 쌀에 대한 상품명, 판매가, 적립포인트를 크롤링해서 assets/rice.txt에 저장
 * 경로 : https://okjmall.com/goods/goods_list.php?cateCd=015
*/

public class CrawlingExer {

	public static void main(String[] args) {

		// URI 객체 생성
		URI uri = null;
		URL url = null;
		URLConnection conn = null;
		InputStream is = null;
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			uri = new URI("https://okjmall.com/goods/goods_list.php?cateCd=015");
			url = uri.toURL();
			conn = url.openConnection();
			is = conn.getInputStream();

			br = new BufferedReader(new InputStreamReader(is));

			File file = new File("C:\\Users\\Administrator\\git\\java\\javabasic\\src\\assets\\rice.txt");

			String readedLine = null;
			bw = new BufferedWriter(new FileWriter(file));
			
			List<ProductInfo> pList = new ArrayList<ProductInfo>();
			
			
			

			while ((readedLine = br.readLine()) != null) {
				
				//상품명 추출
		
				String prodStartStr = "<strong class=\"item_name\">";
				int prodStartIndex = readedLine.indexOf(prodStartStr) + prodStartStr.length();
				int prodEndIndex = readedLine.indexOf("</strong>", prodStartIndex);
				String prodName = null;
				if (prodStartIndex > -1 && prodEndIndex > -1) {
					System.out.println(readedLine.substring(prodStartIndex,prodEndIndex));
					// bw.write(readedLine+"\n");
				}
				
				//가격 추출
				String priceStartStr = "<span  style=\"\">";
				int priceStartIndex = readedLine.indexOf(priceStartStr) + priceStartStr.length();
				int priceEndIndex = readedLine.indexOf("원", priceStartIndex);
				String prodPrice = null;
				if (priceStartIndex > -1 && priceEndIndex > -1) {
					System.out.println(readedLine.substring(priceStartIndex,priceEndIndex));
					// bw.write(readedLine+"\n");
				}
				
				//포인트 추출
				String pointStartStr = "alt\"마일리지\" title=\"마일리지\" />";
				int pointStartIndex = readedLine.indexOf(pointStartStr) + pointStartStr.length();
				int pointEndIndex = readedLine.indexOf("원", pointStartIndex);
				String prodPoint = null;
				if (pointStartIndex > -1 && pointEndIndex > -1) {
					System.out.println(readedLine.substring(pointStartIndex,pointEndIndex));
					// bw.write(readedLine+"\n");
				}
				
				pList.add(new ProductInfo(
											prodName,
											Integer.parseInt(prodPrice),
											Integer.parseInt(prodPoint)
			));
				
				
			}
		} catch (URISyntaxException use) {
			use.printStackTrace();
		} catch (MalformedURLException mue) {
			mue.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				bw.close();
				br.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

	} // main

} // class
