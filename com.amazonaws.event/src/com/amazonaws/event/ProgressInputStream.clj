(ns com.amazonaws.event.ProgressInputStream
  "Used for input stream progress tracking purposes."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.event ProgressInputStream]))

(defn ->progress-input-stream
  "Constructor.

  is - `java.io.InputStream`
  listener - `com.amazonaws.event.ProgressListener`
  notify-thres-hold - `int`"
  (^ProgressInputStream [^java.io.InputStream is ^com.amazonaws.event.ProgressListener listener ^Integer notify-thres-hold]
    (new ProgressInputStream is listener notify-thres-hold))
  (^ProgressInputStream [^java.io.InputStream is ^com.amazonaws.event.ProgressListener listener]
    (new ProgressInputStream is listener)))

(defn *input-stream-for-request
  "Deprecated.

  is - the request content input stream - `java.io.InputStream`
  req - `com.amazonaws.AmazonWebServiceRequest`

  returns: `java.io.InputStream`"
  (^java.io.InputStream [^java.io.InputStream is ^com.amazonaws.AmazonWebServiceRequest req]
    (ProgressInputStream/inputStreamForRequest is req)))

(defn *input-stream-for-response
  "Returns an input stream for response progress tracking purposes. If
   request/response progress tracking is not enabled, this method simply
   return the given input stream as is.

  is - the response content input stream - `java.io.InputStream`
  req - `com.amazonaws.AmazonWebServiceRequest`

  returns: `java.io.InputStream`"
  (^java.io.InputStream [^java.io.InputStream is ^com.amazonaws.AmazonWebServiceRequest req]
    (ProgressInputStream/inputStreamForResponse is req)))

(defn read
  "b - `byte[]`
  off - `int`
  len - `int`

  returns: `int`

  throws: java.io.IOException"
  (^Integer [^ProgressInputStream this b ^Integer off ^Integer len]
    (-> this (.read b off len)))
  (^Integer [^ProgressInputStream this]
    (-> this (.read))))

(defn reset
  "throws: java.io.IOException"
  ([^ProgressInputStream this]
    (-> this (.reset))))

(defn get-wrapped-input-stream
  "returns: `java.io.InputStream`"
  (^java.io.InputStream [^ProgressInputStream this]
    (-> this (.getWrappedInputStream))))

(defn close
  "throws: java.io.IOException"
  ([^ProgressInputStream this]
    (-> this (.close))))

(defn get-listener
  "returns: `com.amazonaws.event.ProgressListener`"
  (^com.amazonaws.event.ProgressListener [^ProgressInputStream this]
    (-> this (.getListener))))

