/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Main.java
 * Description: Demonstrates basic Log4j logging.
 */

package edu.bu.met.cs665;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Demonstrates basic Log4j logging.
 */
public class Main {
  private static final Logger LOGGER = LogManager.getLogger(Main.class);

  /**
   * Run a small Log4j demonstration.
   */
  public static void main(String[] args) {
    LOGGER.info("Application started.");
    LOGGER.debug("Debug details are useful while developing.");
    LOGGER.warn("This is an example warning.");
  }

}
