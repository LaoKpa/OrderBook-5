package fractalfintech.orderbook;

import fractalfintech.orderbook.MarketItem;
import fractalfintech.orderbook.MarketList;
import fractalfintech.orderbook.Order;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.Double;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

@RestController
public class MarketController
{
    private MarketList marketList;

    // Initializes marketplace
    public MarketController()
    {
        marketList = new MarketList();
        marketList.Add("Test");
    }


    @RequestMapping("/")
  	public String index() {
  			return "Greetings from Spring Boot!";
  	}

  }