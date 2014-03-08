package no.skotsj.j8.core;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.System.out;

/**
 * Created by jason on 3/7/14.
 */
public class entry
{

  public static void main(String[] args)
  {
    ArrayList<String> testlist = Lists.newArrayList("one", "two", "three", "six or nine", "flea", "Burpees");

    Collections.sort(testlist, (x, y) -> x.charAt(0) - y.charAt(0)); testlist.stream().map(l -> l.substring(2))
          .mapToInt(String::length).average().ifPresent(out::println);

    testlist.forEach(out::println); "Welcome to the league of draven".chars().distinct().map(
          c -> testlist.stream().anyMatch(s -> s.contains(Character.toString((char) c))) ? c : c + 1).forEach(
          c -> out.printf("%c-", c));
  }
}
