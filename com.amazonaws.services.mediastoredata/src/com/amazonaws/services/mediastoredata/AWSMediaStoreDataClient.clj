(ns com.amazonaws.services.mediastoredata.AWSMediaStoreDataClient
  "Client for accessing MediaStore Data. All service calls made using this client are blocking, and will not return
  until the service call completes.


  An AWS Elemental MediaStore asset is an object, similar to an object in the Amazon S3 service. Objects are the
  fundamental entities that are stored in AWS Elemental MediaStore."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediastoredata AWSMediaStoreDataClient]))

(defn *builder
  "returns: `com.amazonaws.services.mediastoredata.AWSMediaStoreDataClientBuilder`"
  (^com.amazonaws.services.mediastoredata.AWSMediaStoreDataClientBuilder []
    (AWSMediaStoreDataClient/builder )))

(defn delete-object
  "Deletes an object at the specified path.

  request - `com.amazonaws.services.mediastoredata.model.DeleteObjectRequest`

  returns: Result of the DeleteObject operation returned by the service. - `com.amazonaws.services.mediastoredata.model.DeleteObjectResult`

  throws: com.amazonaws.services.mediastoredata.model.ContainerNotFoundException - The specified container was not found for the specified account."
  (^com.amazonaws.services.mediastoredata.model.DeleteObjectResult [^AWSMediaStoreDataClient this ^com.amazonaws.services.mediastoredata.model.DeleteObjectRequest request]
    (-> this (.deleteObject request))))

(defn describe-object
  "Gets the headers for an object at the specified path.

  request - `com.amazonaws.services.mediastoredata.model.DescribeObjectRequest`

  returns: Result of the DescribeObject operation returned by the service. - `com.amazonaws.services.mediastoredata.model.DescribeObjectResult`

  throws: com.amazonaws.services.mediastoredata.model.ContainerNotFoundException - The specified container was not found for the specified account."
  (^com.amazonaws.services.mediastoredata.model.DescribeObjectResult [^AWSMediaStoreDataClient this ^com.amazonaws.services.mediastoredata.model.DescribeObjectRequest request]
    (-> this (.describeObject request))))

(defn get-object
  "Downloads the object at the specified path. If the object’s upload availability is set to streaming,
   AWS Elemental MediaStore downloads the object even if it’s still uploading the object.

  request - `com.amazonaws.services.mediastoredata.model.GetObjectRequest`

  returns: Result of the GetObject operation returned by the service. - `com.amazonaws.services.mediastoredata.model.GetObjectResult`

  throws: com.amazonaws.services.mediastoredata.model.ContainerNotFoundException - The specified container was not found for the specified account."
  (^com.amazonaws.services.mediastoredata.model.GetObjectResult [^AWSMediaStoreDataClient this ^com.amazonaws.services.mediastoredata.model.GetObjectRequest request]
    (-> this (.getObject request))))

(defn list-items
  "Provides a list of metadata entries about folders and objects in the specified folder.

  request - `com.amazonaws.services.mediastoredata.model.ListItemsRequest`

  returns: Result of the ListItems operation returned by the service. - `com.amazonaws.services.mediastoredata.model.ListItemsResult`

  throws: com.amazonaws.services.mediastoredata.model.ContainerNotFoundException - The specified container was not found for the specified account."
  (^com.amazonaws.services.mediastoredata.model.ListItemsResult [^AWSMediaStoreDataClient this ^com.amazonaws.services.mediastoredata.model.ListItemsRequest request]
    (-> this (.listItems request))))

(defn put-object
  "Uploads an object to the specified path. Object sizes are limited to 25 MB for standard upload availability and
   10 MB for streaming upload availability.

  request - `com.amazonaws.services.mediastoredata.model.PutObjectRequest`

  returns: Result of the PutObject operation returned by the service. - `com.amazonaws.services.mediastoredata.model.PutObjectResult`

  throws: com.amazonaws.services.mediastoredata.model.ContainerNotFoundException - The specified container was not found for the specified account."
  (^com.amazonaws.services.mediastoredata.model.PutObjectResult [^AWSMediaStoreDataClient this ^com.amazonaws.services.mediastoredata.model.PutObjectRequest request]
    (-> this (.putObject request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSMediaStoreDataClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

