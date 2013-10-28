package com.ambry.shared;

import com.github.ambry.IndexKey;
import com.github.ambry.IndexKeyFactory;

/**
 * Created with IntelliJ IDEA.
 * User: srsubram
 * Date: 10/26/13
 * Time: 5:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class BlobIdFactory implements IndexKeyFactory {

  @Override
  public IndexKey getKey(String value) {
    return new BlobId(value);
  }
}