(ns com.amazonaws.util.BinaryUtils
  "Utilities for encoding and decoding binary data to and from different forms."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util BinaryUtils]))

(defn ->binary-utils
  "Constructor."
  (^BinaryUtils []
    (new BinaryUtils )))

(defn *to-hex
  "Converts byte data to a Hex-encoded string in lower case.

  data - data to hex encode. - `byte[]`

  returns: hex-encoded string. - `java.lang.String`"
  (^java.lang.String [data]
    (BinaryUtils/toHex data)))

(defn *from-hex
  "Converts a Hex-encoded data string to the original byte data.

  hex-data - hex-encoded data to decode. - `java.lang.String`

  returns: decoded data from the hex string. - `byte[]`"
  ([^java.lang.String hex-data]
    (BinaryUtils/fromHex hex-data)))

(defn *to-base-64
  "Converts byte data to a Base64-encoded string.

  data - data to Base64 encode. - `byte[]`

  returns: encoded Base64 string. - `java.lang.String`"
  (^java.lang.String [data]
    (BinaryUtils/toBase64 data)))

(defn *from-base-64
  "Converts a Base64-encoded string to the original byte data.

  b-64-data - a Base64-encoded string to decode. - `java.lang.String`

  returns: bytes decoded from a Base64 string. - `byte[]`"
  ([^java.lang.String b-64-data]
    (BinaryUtils/fromBase64 b-64-data)))

(defn *to-stream
  "Wraps a ByteBuffer in an InputStream. If the input byteBuffer
   is null, returns an empty stream.

  byte-buffer - The ByteBuffer to wrap. - `java.nio.ByteBuffer`

  returns: An InputStream wrapping the ByteBuffer content. - `java.io.ByteArrayInputStream`"
  (^java.io.ByteArrayInputStream [^java.nio.ByteBuffer byte-buffer]
    (BinaryUtils/toStream byte-buffer)))

(defn *copy-all-bytes-from
  "Returns a copy of all the bytes from the given ByteBuffer,
   from the beginning to the buffer's limit; or null if the input is null.

   The internal states of the given byte buffer will be restored when this
   method completes execution.

   When handling ByteBuffer from user's input, it's typical to
   call the copyBytesFrom(ByteBuffer) instead of
   copyAllBytesFrom(ByteBuffer) so as to account for the position
   of the input ByteBuffer. The opposite is typically true,
   however, when handling ByteBuffer from withint the
   unmarshallers of the low-level clients.

  bb - `java.nio.ByteBuffer`

  returns: `byte[]`"
  ([^java.nio.ByteBuffer bb]
    (BinaryUtils/copyAllBytesFrom bb)))

(defn *copy-bytes-from
  "Returns a copy of the bytes from the given ByteBuffer,
   ranging from the the buffer's current position to the buffer's limit; or
   null if the input is null.

   The internal states of the given byte buffer will be restored when this
   method completes execution.

   When handling ByteBuffer from user's input, it's typical to
   call the copyBytesFrom(ByteBuffer) instead of
   copyAllBytesFrom(ByteBuffer) so as to account for the position
   of the input ByteBuffer. The opposite is typically true,
   however, when handling ByteBuffer from withint the
   unmarshallers of the low-level clients.

  bb - `java.nio.ByteBuffer`

  returns: `byte[]`"
  ([^java.nio.ByteBuffer bb]
    (BinaryUtils/copyBytesFrom bb)))

