(ns com.amazonaws.SignableRequest
  "Represents a sign-able request being sent to an Amazon Web Service, including the
  parameters being sent as part of the request, the endpoint to which the
  request should be sent, etc.

  This class is only intended for internal use inside the AWS client libraries.
  Callers shouldn't ever interact directly with objects of this class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws SignableRequest]))

(defn add-header
  "Sets the specified header for this request.

  name - The name of the header to set. - `java.lang.String`
  value - The header's value. - `java.lang.String`"
  ([^SignableRequest this ^java.lang.String name ^java.lang.String value]
    (-> this (.addHeader name value))))

(defn add-parameter
  "Adds the specified request parameter to this request.

  name - The name of the request parameter. - `java.lang.String`
  value - The value of the request parameter. - `java.lang.String`"
  ([^SignableRequest this ^java.lang.String name ^java.lang.String value]
    (-> this (.addParameter name value))))

(defn set-content
  "Sets the optional stream containing the payload data to include for this
   request. This is used, for example, for S3 chunk encoding.

  content - The optional stream containing the payload data to include for this request. - `java.io.InputStream`"
  ([^SignableRequest this ^java.io.InputStream content]
    (-> this (.setContent content))))

