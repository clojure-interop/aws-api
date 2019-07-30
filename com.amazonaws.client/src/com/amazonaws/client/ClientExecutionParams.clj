(ns com.amazonaws.client.ClientExecutionParams
  "Encapsulates parameters needed for a particular API call. Captures input and output pojo types."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.client ClientExecutionParams]))

(defn ->client-execution-params
  "Constructor."
  (^ClientExecutionParams []
    (new ClientExecutionParams )))

(defn with-input
  "input - `Input`

  returns: `com.amazonaws.client.ClientExecutionParams<Input,Output>`"
  (^com.amazonaws.client.ClientExecutionParams [^ClientExecutionParams this input]
    (-> this (.withInput input))))

(defn with-error-response-handler
  "error-response-handler - `com.amazonaws.http.HttpResponseHandler`

  returns: `com.amazonaws.client.ClientExecutionParams<Input,Output>`"
  (^com.amazonaws.client.ClientExecutionParams [^ClientExecutionParams this ^com.amazonaws.http.HttpResponseHandler error-response-handler]
    (-> this (.withErrorResponseHandler error-response-handler))))

(defn get-response-handler
  "returns: `com.amazonaws.http.HttpResponseHandler<Output>`"
  (^com.amazonaws.http.HttpResponseHandler [^ClientExecutionParams this]
    (-> this (.getResponseHandler))))

(defn get-request-config
  "returns: `com.amazonaws.RequestConfig`"
  (^com.amazonaws.RequestConfig [^ClientExecutionParams this]
    (-> this (.getRequestConfig))))

(defn with-marshaller
  "marshaller - `com.amazonaws.transform.Marshaller`

  returns: `com.amazonaws.client.ClientExecutionParams<Input,Output>`"
  (^com.amazonaws.client.ClientExecutionParams [^ClientExecutionParams this ^com.amazonaws.transform.Marshaller marshaller]
    (-> this (.withMarshaller marshaller))))

(defn get-input
  "returns: `Input`"
  ([^ClientExecutionParams this]
    (-> this (.getInput))))

(defn with-request-config
  "request-config - `com.amazonaws.RequestConfig`

  returns: `com.amazonaws.client.ClientExecutionParams<Input,Output>`"
  (^com.amazonaws.client.ClientExecutionParams [^ClientExecutionParams this ^com.amazonaws.RequestConfig request-config]
    (-> this (.withRequestConfig request-config))))

(defn get-error-response-handler
  "returns: `com.amazonaws.http.HttpResponseHandler<? extends com.amazonaws.SdkBaseException>`"
  ([^ClientExecutionParams this]
    (-> this (.getErrorResponseHandler))))

(defn with-response-handler
  "response-handler - `com.amazonaws.http.HttpResponseHandler`

  returns: `com.amazonaws.client.ClientExecutionParams<Input,Output>`"
  (^com.amazonaws.client.ClientExecutionParams [^ClientExecutionParams this ^com.amazonaws.http.HttpResponseHandler response-handler]
    (-> this (.withResponseHandler response-handler))))

(defn get-marshaller
  "returns: `com.amazonaws.transform.Marshaller<com.amazonaws.Request<Input>,Input>`"
  (^com.amazonaws.transform.Marshaller [^ClientExecutionParams this]
    (-> this (.getMarshaller))))

