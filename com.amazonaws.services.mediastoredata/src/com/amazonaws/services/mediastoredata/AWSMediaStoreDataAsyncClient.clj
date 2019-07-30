(ns com.amazonaws.services.mediastoredata.AWSMediaStoreDataAsyncClient
  "Client for accessing MediaStore Data asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  An AWS Elemental MediaStore asset is an object, similar to an object in the Amazon S3 service. Objects are the
  fundamental entities that are stored in AWS Elemental MediaStore."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediastoredata AWSMediaStoreDataAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.mediastoredata.AWSMediaStoreDataAsyncClientBuilder`"
  (^com.amazonaws.services.mediastoredata.AWSMediaStoreDataAsyncClientBuilder []
    (AWSMediaStoreDataAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSMediaStoreDataAsyncClient this]
    (-> this (.getExecutorService))))

(defn delete-object-async
  "Description copied from interface: AWSMediaStoreDataAsync

  request - `com.amazonaws.services.mediastoredata.model.DeleteObjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteObject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastoredata.model.DeleteObjectResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreDataAsyncClient this ^com.amazonaws.services.mediastoredata.model.DeleteObjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteObjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreDataAsyncClient this ^com.amazonaws.services.mediastoredata.model.DeleteObjectRequest request]
    (-> this (.deleteObjectAsync request))))

(defn describe-object-async
  "Description copied from interface: AWSMediaStoreDataAsync

  request - `com.amazonaws.services.mediastoredata.model.DescribeObjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeObject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastoredata.model.DescribeObjectResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreDataAsyncClient this ^com.amazonaws.services.mediastoredata.model.DescribeObjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeObjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreDataAsyncClient this ^com.amazonaws.services.mediastoredata.model.DescribeObjectRequest request]
    (-> this (.describeObjectAsync request))))

(defn get-object-async
  "Description copied from interface: AWSMediaStoreDataAsync

  request - `com.amazonaws.services.mediastoredata.model.GetObjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetObject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastoredata.model.GetObjectResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreDataAsyncClient this ^com.amazonaws.services.mediastoredata.model.GetObjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getObjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreDataAsyncClient this ^com.amazonaws.services.mediastoredata.model.GetObjectRequest request]
    (-> this (.getObjectAsync request))))

(defn list-items-async
  "Description copied from interface: AWSMediaStoreDataAsync

  request - `com.amazonaws.services.mediastoredata.model.ListItemsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListItems operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastoredata.model.ListItemsResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreDataAsyncClient this ^com.amazonaws.services.mediastoredata.model.ListItemsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listItemsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreDataAsyncClient this ^com.amazonaws.services.mediastoredata.model.ListItemsRequest request]
    (-> this (.listItemsAsync request))))

(defn put-object-async
  "Description copied from interface: AWSMediaStoreDataAsync

  request - `com.amazonaws.services.mediastoredata.model.PutObjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutObject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastoredata.model.PutObjectResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreDataAsyncClient this ^com.amazonaws.services.mediastoredata.model.PutObjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putObjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreDataAsyncClient this ^com.amazonaws.services.mediastoredata.model.PutObjectRequest request]
    (-> this (.putObjectAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSMediaStoreDataAsyncClient this]
    (-> this (.shutdown))))

