(ns com.amazonaws.internal.CRC32MismatchException
  "The exception will be thrown when client side CRC32 checksum does not match the one from server side."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal CRC32MismatchException]))

(defn ->crc-32-mismatch-exception
  "Constructor.

  Creates a new CRC32MismatchException with the specified message, and root
   cause.

  message - An error message describing why this exception was thrown. - `java.lang.String`
  t - The underlying cause of this exception. - `java.lang.Throwable`"
  (^CRC32MismatchException [^java.lang.String message ^java.lang.Throwable t]
    (new CRC32MismatchException message t))
  (^CRC32MismatchException [^java.lang.String message]
    (new CRC32MismatchException message)))

