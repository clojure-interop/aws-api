(ns com.amazonaws.util.DateUtils
  "Utilities for parsing and formatting dates."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util DateUtils]))

(defn ->date-utils
  "Constructor."
  (^DateUtils []
    (new DateUtils )))

(defn *format-service-specific-date
  "Formats the give date object into an AWS Service format.

  date - `java.util.Date`

  returns: `java.lang.String`"
  (^java.lang.String [^java.util.Date date]
    (DateUtils/formatServiceSpecificDate date)))

(defn *parse-iso-8601-date
  "Parses the specified date string as an ISO 8601 date and returns the Date
   object.

  date-string - The date string to parse. - `java.lang.String`

  returns: The parsed Date object. - `java.util.Date`"
  (^java.util.Date [^java.lang.String date-string]
    (DateUtils/parseISO8601Date date-string)))

(defn *format-unix-timestamp-in-mills
  "Formats the give date object into unit timestamp in milli seconds.

  date - `java.util.Date`

  returns: `java.lang.String`"
  (^java.lang.String [^java.util.Date date]
    (DateUtils/formatUnixTimestampInMills date)))

(defn *parse-service-specific-date
  "Parses the given date string returned by the AWS service into a Date
   object.

  date-string - `java.lang.String`

  returns: `java.util.Date`"
  (^java.util.Date [^java.lang.String date-string]
    (DateUtils/parseServiceSpecificDate date-string)))

(defn *clone-date
  "date - `java.util.Date`

  returns: `java.util.Date`"
  (^java.util.Date [^java.util.Date date]
    (DateUtils/cloneDate date)))

(defn *format-iso-8601-date
  "Formats the specified date as an ISO 8601 string.

  date - The date to format. - `java.util.Date`

  returns: The ISO 8601 string representing the specified date. - `java.lang.String`"
  (^java.lang.String [^java.util.Date date]
    (DateUtils/formatISO8601Date date)))

(defn *parse-unix-timestamp-in-millis
  "date-string - `java.lang.String`

  returns: `java.util.Date`"
  (^java.util.Date [^java.lang.String date-string]
    (DateUtils/parseUnixTimestampInMillis date-string)))

(defn *parse-compressed-iso-8601-date
  "Parses the specified date string as a compressedIso8601DateFormat (\"yyyyMMdd'T'HHmmss'Z'\") and returns the Date
   object.

  date-string - The date string to parse. - `java.lang.String`

  returns: The parsed Date object. - `java.util.Date`"
  (^java.util.Date [^java.lang.String date-string]
    (DateUtils/parseCompressedISO8601Date date-string)))

(defn *format-rfc-822-date
  "Formats the specified date as an RFC 822 string.

  date - The date to format. - `java.util.Date`

  returns: The RFC 822 string representing the specified date. - `java.lang.String`"
  (^java.lang.String [^java.util.Date date]
    (DateUtils/formatRFC822Date date)))

(defn *parse-rfc-822-date
  "Parses the specified date string as an RFC 822 date and returns the Date
   object.

  date-string - The date string to parse. - `java.lang.String`

  returns: The parsed Date object. - `java.util.Date`"
  (^java.util.Date [^java.lang.String date-string]
    (DateUtils/parseRFC822Date date-string)))

(defn *number-of-days-since-epoch
  "Returns the number of days since epoch with respect to the given number
   of milliseconds since epoch.

  milli-since-epoch - `long`

  returns: `long`"
  (^Long [^Long milli-since-epoch]
    (DateUtils/numberOfDaysSinceEpoch milli-since-epoch)))

