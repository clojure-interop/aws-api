(ns com.amazonaws.http.RepeatableInputStreamRequestEntity
  "Custom implementation of RequestEntity that delegates to an
  RepeatableInputStreamRequestEntity, with the one notable difference, that if
  the underlying InputStream supports being reset, this RequestEntity will
  report that it is repeatable and will reset the stream on all subsequent
  attempts to write out the request.

  TODO : Move this to apache specific package."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.http RepeatableInputStreamRequestEntity]))

(defn ->repeatable-input-stream-request-entity
  "Constructor.

  Creates a new RepeatableInputStreamRequestEntity using the information
   from the specified request. If the input stream containing the request's
   contents is repeatable, then this RequestEntity will report as being
   repeatable.

  request - The details of the request being written out (content type, content length, and content). - `com.amazonaws.Request`"
  (^RepeatableInputStreamRequestEntity [^com.amazonaws.Request request]
    (new RepeatableInputStreamRequestEntity request)))

(defn chunked?
  "returns: `boolean`"
  (^Boolean [^RepeatableInputStreamRequestEntity this]
    (-> this (.isChunked))))

(defn repeatable?
  "Returns true if the underlying InputStream supports marking/reseting or
   if the underlying InputStreamRequestEntity is repeatable (i.e. its
   content length has been set to
   InputStreamRequestEntity#CONTENT_LENGTH_AUTO and therefore its
   entire contents will be buffered in memory and can be repeated).

  returns: `boolean`"
  (^Boolean [^RepeatableInputStreamRequestEntity this]
    (-> this (.isRepeatable))))

(defn write-to
  "Resets the underlying InputStream if this isn't the first attempt to
   write out the request, otherwise simply delegates to
   InputStreamRequestEntity to write out the data.

   If an error is encountered the first time we try to write the request
   entity, we remember the original exception, and report that as the root
   cause if we continue to encounter errors, rather than masking the
   original error.

  output - `java.io.OutputStream`

  throws: java.io.IOException"
  ([^RepeatableInputStreamRequestEntity this ^java.io.OutputStream output]
    (-> this (.writeTo output))))

