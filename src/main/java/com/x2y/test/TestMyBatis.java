package com.x2y.test;

import com.x2y.pojo.Article;
import com.x2y.pojo.Author;
import com.x2y.pojo.Favorites;
import com.x2y.pojo.FavoritesItems;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TestMyBatis {
   public static void main(String[] args)throws IOException {
       String resource = "mybatis-config.xml";
       InputStream inputStream = Resources.getResourceAsStream(resource);
       SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
       SqlSession session = sqlSessionFactory.openSession();

//       Article article = new Article();
//       article.setTitle("我的作品");
//       article.setAuthor("x2y");
//       session.insert("addArticle",article);
//       article.setId(3);
//       session.delete("deleteArticle",article.getId());
//       article.setId(2);
//       article.setTitle("龙族-火之晨曦");
//       article.setAuthor("江南");

//       session.update("updateArticle",article);



//       List<Article> as = session.selectList("listArticle");
//       for(Article a:as){
//           System.out.println(a.toString());
//       }

//       //模糊查询
//       List<Article> as = session.selectList("listArticleFuzzy","东野");
//       for(Article a:as){
//           System.out.println(a.toString());
//       }

//       Map<String,Object>params = new HashMap<>();
//       params.put("id",0);
//       params.put("string","白夜");
//       List<Article> as = session.selectList("listArticleByIdAndStr",params);
//       for(Article a:as){
//           System.out.println(a.toString());
//       }

//       List<Author>authors = session.selectList("listAuthorWorks");
//       for (Author au : authors) {
//           System.out.println(au);
//           List<Article> articles = au.getArticles();
//           for (Article ar : articles) {
//               System.out.println("\t"+ar);
//           }
//       }
//       List<Article> articles = session.selectList("listArticleAndAuthor");
//       for(Article ar: articles){
//           System.out.println(ar+" ----》 \t "+ ar.getAuthor());
//       };
//       Map<String,Object> params = new HashMap<>();
//       //params.put("id",1);
//       //params.put("name","我的");
//       List<Favorites> favorites = session.selectList("listFavoritesByChoose",params);
//
//       for(Favorites fa :favorites) {
//           System.out.println(fa.getFname());
//           List<FavoritesItems> favoritesItems = fa.getFavoritesItems();
//           for (FavoritesItems fai : favoritesItems){
//               System.out.format("\t%d\t%s\t%d%n",fai.getArticle().getId(),fai.getArticle().getTitle(),fai.getArticle().getAuthor_id());
//           }
//       }

        List<Integer> articleList = new ArrayList<>();
       articleList.add(1);
       articleList.add(2);
       articleList.add(4);

       List<Article> as = session.selectList("listArticleByList",articleList);
       for(Article a:as){
           System.out.println(a.toString());
       }

       session.commit();
       session.close();
   }
}
