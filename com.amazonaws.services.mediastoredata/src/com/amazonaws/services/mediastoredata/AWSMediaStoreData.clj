(ns com.amazonaws.services.mediastoredata.AWSMediaStoreData
  "Interface for accessing MediaStore Data.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSMediaStoreData instead.



  An AWS Elemental MediaStore asset is an object, similar to an object in the Amazon S3 service. Objects are the
  fundamental entities that are stored in AWS Elemental MediaStore."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediastoredata AWSMediaStoreData]))

(defn delete-object
  "Deletes an object at the specified path.

  delete-object-request - `com.amazonaws.services.mediastoredata.model.DeleteObjectRequest`

  returns: Result of the DeleteObject operation returned by the service. - `com.amazonaws.services.mediastoredata.model.DeleteObjectResult`

  throws: com.amazonaws.services.mediastoredata.model.ContainerNotFoundException - The specified container was not found for the specified account."
  (^com.amazonaws.services.mediastoredata.model.DeleteObjectResult [^AWSMediaStoreData this ^com.amazonaws.services.mediastoredata.model.DeleteObjectRequest delete-object-request]
    (-> this (.deleteObject delete-object-request))))

(defn describe-object
  "Gets the headers for an object at the specified path.

  describe-object-request - `com.amazonaws.services.mediastoredata.model.DescribeObjectRequest`

  returns: Result of the DescribeObject operation returned by the service. - `com.amazonaws.services.mediastoredata.model.DescribeObjectResult`

  throws: com.amazonaws.services.mediastoredata.model.ContainerNotFoundException - The specified container was not found for the specified account."
  (^com.amazonaws.services.mediastoredata.model.DescribeObjectResult [^AWSMediaStoreData this ^com.amazonaws.services.mediastoredata.model.DescribeObjectRequest describe-object-request]
    (-> this (.describeObject describe-object-request))))

(defn get-object
  "Downloads the object at the specified path. If the object’s upload availability is set to streaming,
   AWS Elemental MediaStore downloads the object even if it’s still uploading the object.

  get-object-request - `com.amazonaws.services.mediastoredata.model.GetObjectRequest`

  returns: Result of the GetObject operation returned by the service. - `com.amazonaws.services.mediastoredata.model.GetObjectResult`

  throws: com.amazonaws.services.mediastoredata.model.ContainerNotFoundException - The specified container was not found for the specified account."
  (^com.amazonaws.services.mediastoredata.model.GetObjectResult [^AWSMediaStoreData this ^com.amazonaws.services.mediastoredata.model.GetObjectRequest get-object-request]
    (-> this (.getObject get-object-request))))

(defn list-items
  "Provides a list of metadata entries about folders and objects in the specified folder.

  list-items-request - `com.amazonaws.services.mediastoredata.model.ListItemsRequest`

  returns: Result of the ListItems operation returned by the service. - `com.amazonaws.services.mediastoredata.model.ListItemsResult`

  throws: com.amazonaws.services.mediastoredata.model.ContainerNotFoundException - The specified container was not found for the specified account."
  (^com.amazonaws.services.mediastoredata.model.ListItemsResult [^AWSMediaStoreData this ^com.amazonaws.services.mediastoredata.model.ListItemsRequest list-items-request]
    (-> this (.listItems list-items-request))))

(defn put-object
  "Uploads an object to the specified path. Object sizes are limited to 25 MB for standard upload availability and
   10 MB for streaming upload availability.

  put-object-request - `com.amazonaws.services.mediastoredata.model.PutObjectRequest`

  returns: Result of the PutObject operation returned by the service. - `com.amazonaws.services.mediastoredata.model.PutObjectResult`

  throws: com.amazonaws.services.mediastoredata.model.ContainerNotFoundException - The specified container was not found for the specified account."
  (^com.amazonaws.services.mediastoredata.model.PutObjectResult [^AWSMediaStoreData this ^com.amazonaws.services.mediastoredata.model.PutObjectRequest put-object-request]
    (-> this (.putObject put-object-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSMediaStoreData this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSMediaStoreData this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

