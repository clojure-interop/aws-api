(ns com.amazonaws.services.rekognition.AmazonRekognitionAsync
  "Interface for accessing Amazon Rekognition asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonRekognitionAsync instead.



  This is the Amazon Rekognition API reference."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.rekognition AmazonRekognitionAsync]))

(defn delete-faces-async
  "Deletes faces from a collection. You specify a collection ID and an array of face IDs to remove from the
   collection.


   This operation requires permissions to perform the rekognition:DeleteFaces action.

  delete-faces-request - `com.amazonaws.services.rekognition.model.DeleteFacesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.DeleteFacesResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DeleteFacesRequest delete-faces-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFacesAsync delete-faces-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DeleteFacesRequest delete-faces-request]
    (-> this (.deleteFacesAsync delete-faces-request))))

(defn detect-labels-async
  "Detects instances of real-world entities within an image (JPEG or PNG) provided as input. This includes objects
   like flower, tree, and table; events like wedding, graduation, and birthday party; and concepts like landscape,
   evening, and nature.


   For an example, see Analyzing Images Stored in an Amazon S3 Bucket in the Amazon Rekognition Developer Guide.



   DetectLabels does not support the detection of activities. However, activity detection is supported
   for label detection in videos. For more information, see StartLabelDetection in the Amazon Rekognition Developer
   Guide.



   You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If
   you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must
   be either a PNG or JPEG formatted file.


   For each object, scene, and concept the API returns one or more labels. Each label provides the object name, and
   the level of confidence that the image contains the object. For example, suppose the input image has a
   lighthouse, the sea, and a rock. The response includes all three labels, one for each object.


   {Name: lighthouse, Confidence: 98.4629}


   {Name: rock,Confidence: 79.2097}


    {Name: sea,Confidence: 75.061}


   In the preceding example, the operation returns one label for each of the three objects. The operation can also
   return multiple labels for the same object in the image. For example, if the input image shows a flower (for
   example, a tulip), the operation might return the following three labels.


   {Name: flower,Confidence: 99.0562}


   {Name: plant,Confidence: 99.0562}


   {Name: tulip,Confidence: 99.0562}


   In this example, the detection algorithm more precisely identifies the flower as a tulip.


   In response, the API returns an array of labels. In addition, the response also includes the orientation
   correction. Optionally, you can specify MinConfidence to control the confidence threshold for the
   labels returned. The default is 55%. You can also add the MaxLabels parameter to limit the number of
   labels returned.



   If the object detected is a person, the operation doesn't provide the same facial details that the
   DetectFaces operation provides.



   DetectLabels returns bounding boxes for instances of common object labels in an array of
   Instance objects. An Instance object contains a BoundingBox object, for the location
   of the label on the image. It also includes the confidence by which the bounding box was detected.


   DetectLabels also returns a hierarchical taxonomy of detected labels. For example, a detected car
   might be assigned the label car. The label car has two parent labels: Vehicle (its parent)
   and Transportation (its grandparent). The response returns the entire list of ancestors for a label. Each
   ancestor is a unique label in the response. In the previous example, Car, Vehicle, and
   Transportation are returned as unique labels in the response.


   This is a stateless API operation. That is, the operation does not persist any data.


   This operation requires permissions to perform the rekognition:DetectLabels action.

  detect-labels-request - `com.amazonaws.services.rekognition.model.DetectLabelsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectLabels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.DetectLabelsResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DetectLabelsRequest detect-labels-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectLabelsAsync detect-labels-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DetectLabelsRequest detect-labels-request]
    (-> this (.detectLabelsAsync detect-labels-request))))

(defn search-faces-by-image-async
  "For a given input image, first detects the largest face in the image, and then searches the specified collection
   for matching faces. The operation compares the features of the input face with faces in the specified collection.



   To search for all faces in an input image, you might first call the IndexFaces operation, and then use the
   face IDs returned in subsequent calls to the SearchFaces operation.


   You can also call the DetectFaces operation and use the bounding boxes in the response to make face
   crops, which then you can pass in to the SearchFacesByImage operation.



   You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
   bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The
   image must be either a PNG or JPEG formatted file.


   The response returns an array of faces that match, ordered by similarity score with the highest similarity first.
   More specifically, it is an array of metadata for each face match found. Along with the metadata, the response
   also includes a similarity indicating how similar the face is to the input face. In the response,
   the operation also returns the bounding box (and a confidence level that the bounding box contains a face) of the
   face that Amazon Rekognition used for the input image.


   For an example, Searching for a Face Using an Image in the Amazon Rekognition Developer Guide.


   This operation requires permissions to perform the rekognition:SearchFacesByImage action.

  search-faces-by-image-request - `com.amazonaws.services.rekognition.model.SearchFacesByImageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchFacesByImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.SearchFacesByImageResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.SearchFacesByImageRequest search-faces-by-image-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchFacesByImageAsync search-faces-by-image-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.SearchFacesByImageRequest search-faces-by-image-request]
    (-> this (.searchFacesByImageAsync search-faces-by-image-request))))

(defn describe-stream-processor-async
  "Provides information about a stream processor created by CreateStreamProcessor. You can get information
   about the input and output streams, the input parameters for the face recognition being performed, and the
   current status of the stream processor.

  describe-stream-processor-request - `com.amazonaws.services.rekognition.model.DescribeStreamProcessorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStreamProcessor operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.DescribeStreamProcessorResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DescribeStreamProcessorRequest describe-stream-processor-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStreamProcessorAsync describe-stream-processor-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DescribeStreamProcessorRequest describe-stream-processor-request]
    (-> this (.describeStreamProcessorAsync describe-stream-processor-request))))

(defn get-face-detection-async
  "Gets face detection results for a Amazon Rekognition Video analysis started by StartFaceDetection.


   Face detection with Amazon Rekognition Video is an asynchronous operation. You start face detection by calling
   StartFaceDetection which returns a job identifier (JobId). When the face detection operation
   finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic
   registered in the initial call to StartFaceDetection. To get the results of the face detection
   operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so,
   call GetFaceDetection and pass the job identifier (JobId) from the initial call to
   StartFaceDetection.


   GetFaceDetection returns an array of detected faces (Faces) sorted by the time the
   faces were detected.


   Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in
   MaxResults, the value of NextToken in the operation response contains a pagination
   token for getting the next set of results. To get the next page of results, call GetFaceDetection
   and populate the NextToken request parameter with the token value returned from the previous call to
   GetFaceDetection.

  get-face-detection-request - `com.amazonaws.services.rekognition.model.GetFaceDetectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFaceDetection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.GetFaceDetectionResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetFaceDetectionRequest get-face-detection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFaceDetectionAsync get-face-detection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetFaceDetectionRequest get-face-detection-request]
    (-> this (.getFaceDetectionAsync get-face-detection-request))))

(defn get-content-moderation-async
  "Gets the content moderation analysis results for a Amazon Rekognition Video analysis started by
   StartContentModeration.


   Content moderation analysis of a video is an asynchronous operation. You start analysis by calling
   StartContentModeration which returns a job identifier (JobId). When analysis finishes, Amazon
   Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the
   initial call to StartContentModeration. To get the results of the content moderation analysis, first
   check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call
   GetContentModeration and pass the job identifier (JobId) from the initial call to
   StartContentModeration.


   For more information, see Working with Stored Videos in the Amazon Rekognition Devlopers Guide.


   GetContentModeration returns detected content moderation labels, and the time they are detected, in
   an array, ModerationLabels, of ContentModerationDetection objects.


   By default, the moderated labels are returned sorted by time, in milliseconds from the start of the video. You
   can also sort them by moderated label by specifying NAME for the SortBy input
   parameter.


   Since video analysis can return a large number of results, use the MaxResults parameter to limit the
   number of labels returned in a single call to GetContentModeration. If there are more results than
   specified in MaxResults, the value of NextToken in the operation response contains a
   pagination token for getting the next set of results. To get the next page of results, call
   GetContentModeration and populate the NextToken request parameter with the value of
   NextToken returned from the previous call to GetContentModeration.


   For more information, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide.

  get-content-moderation-request - `com.amazonaws.services.rekognition.model.GetContentModerationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetContentModeration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.GetContentModerationResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetContentModerationRequest get-content-moderation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getContentModerationAsync get-content-moderation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetContentModerationRequest get-content-moderation-request]
    (-> this (.getContentModerationAsync get-content-moderation-request))))

(defn get-face-search-async
  "Gets the face search results for Amazon Rekognition Video face search started by StartFaceSearch. The
   search returns faces in a collection that match the faces of persons detected in a video. It also includes the
   time(s) that faces are matched in the video.


   Face search in a video is an asynchronous operation. You start face search by calling to StartFaceSearch
   which returns a job identifier (JobId). When the search operation finishes, Amazon Rekognition Video
   publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to
   StartFaceSearch. To get the search results, first check that the status value published to the
   Amazon SNS topic is SUCCEEDED. If so, call GetFaceSearch and pass the job identifier (
   JobId) from the initial call to StartFaceSearch.


   For more information, see Searching Faces in a Collection in the Amazon Rekognition Developer Guide.


   The search results are retured in an array, Persons, of PersonMatch objects. Each
   PersonMatch element contains details about the matching faces in the input collection, person
   information (facial attributes, bounding boxes, and person identifer) for the matched person, and the time the
   person was matched in the video.



   GetFaceSearch only returns the default facial attributes (BoundingBox,
   Confidence, Landmarks, Pose, and Quality). The other facial
   attributes listed in the Face object of the following response syntax are not returned. For more
   information, see FaceDetail in the Amazon Rekognition Developer Guide.



   By default, the Persons array is sorted by the time, in milliseconds from the start of the video,
   persons are matched. You can also sort by persons by specifying INDEX for the SORTBY
   input parameter.

  get-face-search-request - `com.amazonaws.services.rekognition.model.GetFaceSearchRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFaceSearch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.GetFaceSearchResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetFaceSearchRequest get-face-search-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFaceSearchAsync get-face-search-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetFaceSearchRequest get-face-search-request]
    (-> this (.getFaceSearchAsync get-face-search-request))))

(defn delete-collection-async
  "Deletes the specified collection. Note that this operation removes all faces in the collection. For an example,
   see delete-collection-procedure.


   This operation requires permissions to perform the rekognition:DeleteCollection action.

  delete-collection-request - `com.amazonaws.services.rekognition.model.DeleteCollectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCollection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.DeleteCollectionResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DeleteCollectionRequest delete-collection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCollectionAsync delete-collection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DeleteCollectionRequest delete-collection-request]
    (-> this (.deleteCollectionAsync delete-collection-request))))

(defn list-faces-async
  "Returns metadata for faces in the specified collection. This metadata includes information such as the bounding
   box coordinates, the confidence (that the bounding box contains a face), and face ID. For an example, see Listing
   Faces in a Collection in the Amazon Rekognition Developer Guide.


   This operation requires permissions to perform the rekognition:ListFaces action.

  list-faces-request - `com.amazonaws.services.rekognition.model.ListFacesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.ListFacesResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.ListFacesRequest list-faces-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFacesAsync list-faces-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.ListFacesRequest list-faces-request]
    (-> this (.listFacesAsync list-faces-request))))

(defn detect-moderation-labels-async
  "Detects explicit or suggestive adult content in a specified JPEG or PNG format image. Use
   DetectModerationLabels to moderate images depending on your requirements. For example, you might
   want to filter images that contain nudity, but not images containing suggestive content.


   To filter images, use the labels returned by DetectModerationLabels to determine which types of
   content are appropriate.


   For information about moderation labels, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide.


   You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
   bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The
   image must be either a PNG or JPEG formatted file.

  detect-moderation-labels-request - `com.amazonaws.services.rekognition.model.DetectModerationLabelsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectModerationLabels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.DetectModerationLabelsResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DetectModerationLabelsRequest detect-moderation-labels-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectModerationLabelsAsync detect-moderation-labels-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DetectModerationLabelsRequest detect-moderation-labels-request]
    (-> this (.detectModerationLabelsAsync detect-moderation-labels-request))))

(defn start-person-tracking-async
  "Starts the asynchronous tracking of a person's path in a stored video.


   Amazon Rekognition Video can track the path of people in a video stored in an Amazon S3 bucket. Use Video
   to specify the bucket name and the filename of the video. StartPersonTracking returns a job
   identifier (JobId) which you use to get the results of the operation. When label detection is
   finished, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic that
   you specify in NotificationChannel.


   To get the results of the person detection operation, first check that the status value published to the Amazon
   SNS topic is SUCCEEDED. If so, call GetPersonTracking and pass the job identifier (
   JobId) from the initial call to StartPersonTracking.

  start-person-tracking-request - `com.amazonaws.services.rekognition.model.StartPersonTrackingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartPersonTracking operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.StartPersonTrackingResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartPersonTrackingRequest start-person-tracking-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startPersonTrackingAsync start-person-tracking-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartPersonTrackingRequest start-person-tracking-request]
    (-> this (.startPersonTrackingAsync start-person-tracking-request))))

(defn get-label-detection-async
  "Gets the label detection results of a Amazon Rekognition Video analysis started by StartLabelDetection.


   The label detection operation is started by a call to StartLabelDetection which returns a job identifier (
   JobId). When the label detection operation finishes, Amazon Rekognition publishes a completion
   status to the Amazon Simple Notification Service topic registered in the initial call to
   StartlabelDetection. To get the results of the label detection operation, first check that the
   status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetLabelDetection
   and pass the job identifier (JobId) from the initial call to StartLabelDetection.


   GetLabelDetection returns an array of detected labels (Labels) sorted by the time the
   labels were detected. You can also sort by the label name by specifying NAME for the
   SortBy input parameter.


   The labels returned include the label name, the percentage confidence in the accuracy of the detected label, and
   the time the label was detected in the video.


   The returned labels also include bounding box information for common objects, a hierarchical taxonomy of detected
   labels, and the version of the label model used for detection.


   Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in
   MaxResults, the value of NextToken in the operation response contains a pagination
   token for getting the next set of results. To get the next page of results, call GetlabelDetection
   and populate the NextToken request parameter with the token value returned from the previous call to
   GetLabelDetection.

  get-label-detection-request - `com.amazonaws.services.rekognition.model.GetLabelDetectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLabelDetection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.GetLabelDetectionResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetLabelDetectionRequest get-label-detection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLabelDetectionAsync get-label-detection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetLabelDetectionRequest get-label-detection-request]
    (-> this (.getLabelDetectionAsync get-label-detection-request))))

(defn start-face-search-async
  "Starts the asynchronous search for faces in a collection that match the faces of persons detected in a stored
   video.


   The video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of
   the video. StartFaceSearch returns a job identifier (JobId) which you use to get the
   search results once the search has completed. When searching is finished, Amazon Rekognition Video publishes a
   completion status to the Amazon Simple Notification Service topic that you specify in
   NotificationChannel. To get the search results, first check that the status value published to the
   Amazon SNS topic is SUCCEEDED. If so, call GetFaceSearch and pass the job identifier (
   JobId) from the initial call to StartFaceSearch. For more information, see
   procedure-person-search-videos.

  start-face-search-request - `com.amazonaws.services.rekognition.model.StartFaceSearchRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartFaceSearch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.StartFaceSearchResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartFaceSearchRequest start-face-search-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startFaceSearchAsync start-face-search-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartFaceSearchRequest start-face-search-request]
    (-> this (.startFaceSearchAsync start-face-search-request))))

(defn start-face-detection-async
  "Starts asynchronous detection of faces in a stored video.


   Amazon Rekognition Video can detect faces in a video stored in an Amazon S3 bucket. Use Video to specify
   the bucket name and the filename of the video. StartFaceDetection returns a job identifier (
   JobId) that you use to get the results of the operation. When face detection is finished, Amazon
   Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify
   in NotificationChannel. To get the results of the face detection operation, first check that the
   status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceDetection and
   pass the job identifier (JobId) from the initial call to StartFaceDetection.


   For more information, see Detecting Faces in a Stored Video in the Amazon Rekognition Developer Guide.

  start-face-detection-request - `com.amazonaws.services.rekognition.model.StartFaceDetectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartFaceDetection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.StartFaceDetectionResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartFaceDetectionRequest start-face-detection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startFaceDetectionAsync start-face-detection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartFaceDetectionRequest start-face-detection-request]
    (-> this (.startFaceDetectionAsync start-face-detection-request))))

(defn search-faces-async
  "For a given input face ID, searches for matching faces in the collection the face belongs to. You get a face ID
   when you add a face to the collection using the IndexFaces operation. The operation compares the features
   of the input face with faces in the specified collection.



   You can also search faces without indexing faces by using the SearchFacesByImage operation.



   The operation response returns an array of faces that match, ordered by similarity score with the highest
   similarity first. More specifically, it is an array of metadata for each face match that is found. Along with the
   metadata, the response also includes a confidence value for each face match, indicating the
   confidence that the specific face matches the input face.


   For an example, see Searching for a Face Using Its Face ID in the Amazon Rekognition Developer Guide.


   This operation requires permissions to perform the rekognition:SearchFaces action.

  search-faces-request - `com.amazonaws.services.rekognition.model.SearchFacesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchFaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.SearchFacesResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.SearchFacesRequest search-faces-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchFacesAsync search-faces-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.SearchFacesRequest search-faces-request]
    (-> this (.searchFacesAsync search-faces-request))))

(defn start-label-detection-async
  "Starts asynchronous detection of labels in a stored video.


   Amazon Rekognition Video can detect labels in a video. Labels are instances of real-world entities. This includes
   objects like flower, tree, and table; events like wedding, graduation, and birthday party; concepts like
   landscape, evening, and nature; and activities like a person getting out of a car or a person skiing.


   The video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of
   the video. StartLabelDetection returns a job identifier (JobId) which you use to get
   the results of the operation. When label detection is finished, Amazon Rekognition Video publishes a completion
   status to the Amazon Simple Notification Service topic that you specify in NotificationChannel.


   To get the results of the label detection operation, first check that the status value published to the Amazon
   SNS topic is SUCCEEDED. If so, call GetLabelDetection and pass the job identifier (
   JobId) from the initial call to StartLabelDetection.

  start-label-detection-request - `com.amazonaws.services.rekognition.model.StartLabelDetectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartLabelDetection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.StartLabelDetectionResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartLabelDetectionRequest start-label-detection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startLabelDetectionAsync start-label-detection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartLabelDetectionRequest start-label-detection-request]
    (-> this (.startLabelDetectionAsync start-label-detection-request))))

(defn describe-collection-async
  "Describes the specified collection. You can use DescribeCollection to get information, such as the
   number of faces indexed into a collection and the version of the model used by the collection for face detection.


   For more information, see Describing a Collection in the Amazon Rekognition Developer Guide.

  describe-collection-request - `com.amazonaws.services.rekognition.model.DescribeCollectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCollection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.DescribeCollectionResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DescribeCollectionRequest describe-collection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCollectionAsync describe-collection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DescribeCollectionRequest describe-collection-request]
    (-> this (.describeCollectionAsync describe-collection-request))))

(defn delete-stream-processor-async
  "Deletes the stream processor identified by Name. You assign the value for Name when you
   create the stream processor with CreateStreamProcessor. You might not be able to use the same name for a
   stream processor for a few seconds after calling DeleteStreamProcessor.

  delete-stream-processor-request - `com.amazonaws.services.rekognition.model.DeleteStreamProcessorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStreamProcessor operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.DeleteStreamProcessorResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DeleteStreamProcessorRequest delete-stream-processor-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStreamProcessorAsync delete-stream-processor-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DeleteStreamProcessorRequest delete-stream-processor-request]
    (-> this (.deleteStreamProcessorAsync delete-stream-processor-request))))

(defn index-faces-async
  "Detects faces in the input image and adds them to the specified collection.


   Amazon Rekognition doesn't save the actual faces that are detected. Instead, the underlying detection algorithm
   first detects the faces in the input image. For each face, the algorithm extracts facial features into a feature
   vector, and stores it in the backend database. Amazon Rekognition uses feature vectors when it performs face
   match and search operations using the SearchFaces and SearchFacesByImage operations.


   For more information, see Adding Faces to a Collection in the Amazon Rekognition Developer Guide.


   To get the number of faces in a collection, call DescribeCollection.


   If you're using version 1.0 of the face detection model, IndexFaces indexes the 15 largest faces in
   the input image. Later versions of the face detection model index the 100 largest faces in the input image.


   If you're using version 4 or later of the face model, image orientation information is not returned in the
   OrientationCorrection field.


   To determine which version of the model you're using, call DescribeCollection and supply the collection
   ID. You can also get the model version from the value of FaceModelVersion in the response from
   IndexFaces


   For more information, see Model Versioning in the Amazon Rekognition Developer Guide.


   If you provide the optional ExternalImageID for the input image you provided, Amazon Rekognition
   associates this ID with all faces that it detects. When you call the ListFaces operation, the response
   returns the external ID. You can use this external image ID to create a client-side index to associate the faces
   with each image. You can then use the index to find all faces in an image.


   You can specify the maximum number of faces to index with the MaxFaces input parameter. This is
   useful when you want to index the largest faces in an image and don't want to index smaller faces, such as those
   belonging to people standing in the background.


   The QualityFilter input parameter allows you to filter out detected faces that don’t meet the
   required quality bar chosen by Amazon Rekognition. The quality bar is based on a variety of common use cases. By
   default, IndexFaces filters detected faces. You can also explicitly filter detected faces by
   specifying AUTO for the value of QualityFilter. If you do not want to filter detected
   faces, specify NONE.



   To use quality filtering, you need a collection associated with version 3 of the face model. To get the version
   of the face model associated with a collection, call DescribeCollection.



   Information about faces detected in an image, but not indexed, is returned in an array of UnindexedFace
   objects, UnindexedFaces. Faces aren't indexed for reasons such as:




   The number of faces detected exceeds the value of the MaxFaces request parameter.




   The face is too small compared to the image dimensions.




   The face is too blurry.




   The image is too dark.




   The face has an extreme pose.




   In response, the IndexFaces operation returns an array of metadata for all detected faces,
   FaceRecords. This includes:




   The bounding box, BoundingBox, of the detected face.




   A confidence value, Confidence, which indicates the confidence that the bounding box contains a
   face.




   A face ID, FaceId, assigned by the service for each face that's detected and stored.




   An image ID, ImageId, assigned by the service for the input image.




   If you request all facial attributes (by using the detectionAttributes parameter), Amazon
   Rekognition returns detailed facial attributes, such as facial landmarks (for example, location of eye and mouth)
   and other facial attributes like gender. If you provide the same image, specify the same collection, and use the
   same external ID in the IndexFaces operation, Amazon Rekognition doesn't save duplicate face
   metadata.



   The input image is passed either as base64-encoded image bytes, or as a reference to an image in an Amazon S3
   bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The
   image must be formatted as a PNG or JPEG file.


   This operation requires permissions to perform the rekognition:IndexFaces action.

  index-faces-request - `com.amazonaws.services.rekognition.model.IndexFacesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the IndexFaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.IndexFacesResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.IndexFacesRequest index-faces-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.indexFacesAsync index-faces-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.IndexFacesRequest index-faces-request]
    (-> this (.indexFacesAsync index-faces-request))))

(defn recognize-celebrities-async
  "Returns an array of celebrities recognized in the input image. For more information, see Recognizing Celebrities
   in the Amazon Rekognition Developer Guide.


   RecognizeCelebrities returns the 100 largest faces in the image. It lists recognized celebrities in
   the CelebrityFaces array and unrecognized faces in the UnrecognizedFaces array.
   RecognizeCelebrities doesn't return celebrities whose faces aren't among the largest 100 faces in
   the image.


   For each celebrity recognized, RecognizeCelebrities returns a Celebrity object. The
   Celebrity object contains the celebrity name, ID, URL links to additional information, match
   confidence, and a ComparedFace object that you can use to locate the celebrity's face on the image.


   Amazon Rekognition doesn't retain information about which images a celebrity has been recognized in. Your
   application must store this information and use the Celebrity ID property as a unique identifier for
   the celebrity. If you don't store the celebrity name or additional information URLs returned by
   RecognizeCelebrities, you will need the ID to identify the celebrity in a call to the
   GetCelebrityInfo operation.


   You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
   bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The
   image must be either a PNG or JPEG formatted file.


   For an example, see Recognizing Celebrities in an Image in the Amazon Rekognition Developer Guide.


   This operation requires permissions to perform the rekognition:RecognizeCelebrities operation.

  recognize-celebrities-request - `com.amazonaws.services.rekognition.model.RecognizeCelebritiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RecognizeCelebrities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.RecognizeCelebritiesResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.RecognizeCelebritiesRequest recognize-celebrities-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.recognizeCelebritiesAsync recognize-celebrities-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.RecognizeCelebritiesRequest recognize-celebrities-request]
    (-> this (.recognizeCelebritiesAsync recognize-celebrities-request))))

(defn get-celebrity-info-async
  "Gets the name and additional information about a celebrity based on his or her Amazon Rekognition ID. The
   additional information is returned as an array of URLs. If there is no additional information about the
   celebrity, this list is empty.


   For more information, see Recognizing Celebrities in an Image in the Amazon Rekognition Developer Guide.


   This operation requires permissions to perform the rekognition:GetCelebrityInfo action.

  get-celebrity-info-request - `com.amazonaws.services.rekognition.model.GetCelebrityInfoRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCelebrityInfo operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.GetCelebrityInfoResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetCelebrityInfoRequest get-celebrity-info-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCelebrityInfoAsync get-celebrity-info-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetCelebrityInfoRequest get-celebrity-info-request]
    (-> this (.getCelebrityInfoAsync get-celebrity-info-request))))

(defn start-content-moderation-async
  "Starts asynchronous detection of explicit or suggestive adult content in a stored video.


   Amazon Rekognition Video can moderate content in a video stored in an Amazon S3 bucket. Use Video to
   specify the bucket name and the filename of the video. StartContentModeration returns a job
   identifier (JobId) which you use to get the results of the analysis. When content moderation
   analysis is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification
   Service topic that you specify in NotificationChannel.


   To get the results of the content moderation analysis, first check that the status value published to the Amazon
   SNS topic is SUCCEEDED. If so, call GetContentModeration and pass the job identifier (
   JobId) from the initial call to StartContentModeration.


   For more information, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide.

  start-content-moderation-request - `com.amazonaws.services.rekognition.model.StartContentModerationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartContentModeration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.StartContentModerationResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartContentModerationRequest start-content-moderation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startContentModerationAsync start-content-moderation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartContentModerationRequest start-content-moderation-request]
    (-> this (.startContentModerationAsync start-content-moderation-request))))

(defn stop-stream-processor-async
  "Stops a running stream processor that was created by CreateStreamProcessor.

  stop-stream-processor-request - `com.amazonaws.services.rekognition.model.StopStreamProcessorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopStreamProcessor operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.StopStreamProcessorResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StopStreamProcessorRequest stop-stream-processor-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopStreamProcessorAsync stop-stream-processor-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StopStreamProcessorRequest stop-stream-processor-request]
    (-> this (.stopStreamProcessorAsync stop-stream-processor-request))))

(defn create-stream-processor-async
  "Creates an Amazon Rekognition stream processor that you can use to detect and recognize faces in a streaming
   video.


   Amazon Rekognition Video is a consumer of live video from Amazon Kinesis Video Streams. Amazon Rekognition Video
   sends analysis results to Amazon Kinesis Data Streams.


   You provide as input a Kinesis video stream (Input) and a Kinesis data stream (Output)
   stream. You also specify the face recognition criteria in Settings. For example, the collection
   containing faces that you want to recognize. Use Name to assign an identifier for the stream
   processor. You use Name to manage the stream processor. For example, you can start processing the
   source video by calling StartStreamProcessor with the Name field.


   After you have finished analyzing a streaming video, use StopStreamProcessor to stop processing. You can
   delete the stream processor by calling DeleteStreamProcessor.

  create-stream-processor-request - `com.amazonaws.services.rekognition.model.CreateStreamProcessorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStreamProcessor operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.CreateStreamProcessorResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.CreateStreamProcessorRequest create-stream-processor-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStreamProcessorAsync create-stream-processor-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.CreateStreamProcessorRequest create-stream-processor-request]
    (-> this (.createStreamProcessorAsync create-stream-processor-request))))

(defn start-stream-processor-async
  "Starts processing a stream processor. You create a stream processor by calling CreateStreamProcessor. To
   tell StartStreamProcessor which stream processor to start, use the value of the Name
   field specified in the call to CreateStreamProcessor.

  start-stream-processor-request - `com.amazonaws.services.rekognition.model.StartStreamProcessorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartStreamProcessor operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.StartStreamProcessorResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartStreamProcessorRequest start-stream-processor-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startStreamProcessorAsync start-stream-processor-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartStreamProcessorRequest start-stream-processor-request]
    (-> this (.startStreamProcessorAsync start-stream-processor-request))))

(defn detect-faces-async
  "Detects faces within an image that is provided as input.


   DetectFaces detects the 100 largest faces in the image. For each face detected, the operation
   returns face details. These details include a bounding box of the face, a confidence value (that the bounding box
   contains a face), and a fixed set of attributes such as facial landmarks (for example, coordinates of eye and
   mouth), gender, presence of beard, sunglasses, and so on.


   The face-detection algorithm is most effective on frontal faces. For non-frontal or obscured faces, the algorithm
   might not detect the faces or might detect faces with lower confidence.


   You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
   bucket. If you use the to call Amazon Rekognition operations, passing image bytes is not supported. The image
   must be either a PNG or JPEG formatted file.



   This is a stateless API operation. That is, the operation does not persist any data.



   This operation requires permissions to perform the rekognition:DetectFaces action.

  detect-faces-request - `com.amazonaws.services.rekognition.model.DetectFacesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectFaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.DetectFacesResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DetectFacesRequest detect-faces-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectFacesAsync detect-faces-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DetectFacesRequest detect-faces-request]
    (-> this (.detectFacesAsync detect-faces-request))))

(defn get-person-tracking-async
  "Gets the path tracking results of a Amazon Rekognition Video analysis started by StartPersonTracking.


   The person path tracking operation is started by a call to StartPersonTracking which returns a job
   identifier (JobId). When the operation finishes, Amazon Rekognition Video publishes a completion
   status to the Amazon Simple Notification Service topic registered in the initial call to
   StartPersonTracking.


   To get the results of the person path tracking operation, first check that the status value published to the
   Amazon SNS topic is SUCCEEDED. If so, call GetPersonTracking and pass the job identifier (
   JobId) from the initial call to StartPersonTracking.


   GetPersonTracking returns an array, Persons, of tracked persons and the time(s) their
   paths were tracked in the video.



   GetPersonTracking only returns the default facial attributes (BoundingBox,
   Confidence, Landmarks, Pose, and Quality). The other facial
   attributes listed in the Face object of the following response syntax are not returned.


   For more information, see FaceDetail in the Amazon Rekognition Developer Guide.



   By default, the array is sorted by the time(s) a person's path is tracked in the video. You can sort by tracked
   persons by specifying INDEX for the SortBy input parameter.


   Use the MaxResults parameter to limit the number of items returned. If there are more results than
   specified in MaxResults, the value of NextToken in the operation response contains a
   pagination token for getting the next set of results. To get the next page of results, call
   GetPersonTracking and populate the NextToken request parameter with the token value
   returned from the previous call to GetPersonTracking.

  get-person-tracking-request - `com.amazonaws.services.rekognition.model.GetPersonTrackingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPersonTracking operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.GetPersonTrackingResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetPersonTrackingRequest get-person-tracking-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPersonTrackingAsync get-person-tracking-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetPersonTrackingRequest get-person-tracking-request]
    (-> this (.getPersonTrackingAsync get-person-tracking-request))))

(defn detect-text-async
  "Detects text in the input image and converts it into machine-readable text.


   Pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you
   use the AWS CLI to call Amazon Rekognition operations, you must pass it as a reference to an image in an Amazon
   S3 bucket. For the AWS CLI, passing image bytes is not supported. The image must be either a .png or .jpeg
   formatted file.


   The DetectText operation returns text in an array of TextDetection elements,
   TextDetections. Each TextDetection element provides information about a single word or
   line of text that was detected in the image.


   A word is one or more ISO basic latin script characters that are not separated by spaces. DetectText
   can detect up to 50 words in an image.


   A line is a string of equally spaced words. A line isn't necessarily a complete sentence. For example, a driver's
   license number is detected as a line. A line ends when there is no aligned text after it. Also, a line ends when
   there is a large gap between words, relative to the length of the words. This means, depending on the gap between
   words, Amazon Rekognition may detect multiple lines in text aligned in the same direction. Periods don't
   represent the end of a line. If a sentence spans multiple lines, the DetectText operation returns
   multiple lines.


   To determine whether a TextDetection element is a line of text or a word, use the
   TextDetection object Type field.


   To be detected, text must be within /- 90 degrees orientation of the horizontal axis.


   For more information, see DetectText in the Amazon Rekognition Developer Guide.

  detect-text-request - `com.amazonaws.services.rekognition.model.DetectTextRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectText operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.DetectTextResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DetectTextRequest detect-text-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectTextAsync detect-text-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DetectTextRequest detect-text-request]
    (-> this (.detectTextAsync detect-text-request))))

(defn create-collection-async
  "Creates a collection in an AWS Region. You can add faces to the collection using the IndexFaces operation.


   For example, you might create collections, one for each of your application users. A user can then index faces
   using the IndexFaces operation and persist results in a specific collection. Then, a user can search
   the collection for faces in the user-specific container.


   When you create a collection, it is associated with the latest version of the face model version.



   Collection names are case-sensitive.



   This operation requires permissions to perform the rekognition:CreateCollection action.

  create-collection-request - `com.amazonaws.services.rekognition.model.CreateCollectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCollection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.CreateCollectionResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.CreateCollectionRequest create-collection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCollectionAsync create-collection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.CreateCollectionRequest create-collection-request]
    (-> this (.createCollectionAsync create-collection-request))))

(defn list-stream-processors-async
  "Gets a list of stream processors that you have created with CreateStreamProcessor.

  list-stream-processors-request - `com.amazonaws.services.rekognition.model.ListStreamProcessorsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStreamProcessors operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.ListStreamProcessorsResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.ListStreamProcessorsRequest list-stream-processors-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStreamProcessorsAsync list-stream-processors-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.ListStreamProcessorsRequest list-stream-processors-request]
    (-> this (.listStreamProcessorsAsync list-stream-processors-request))))

(defn compare-faces-async
  "Compares a face in the source input image with each of the 100 largest faces detected in the target
   input image.



   If the source image contains multiple faces, the service detects the largest face and compares it with each face
   detected in the target image.



   You pass the input and target images either as base64-encoded image bytes or as references to images in an Amazon
   S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The
   image must be formatted as a PNG or JPEG file.


   In response, the operation returns an array of face matches ordered by similarity score in descending order. For
   each face match, the response provides a bounding box of the face, facial landmarks, pose details (pitch, role,
   and yaw), quality (brightness and sharpness), and confidence value (indicating the level of confidence that the
   bounding box contains a face). The response also provides a similarity score, which indicates how closely the
   faces match.



   By default, only faces with a similarity score of greater than or equal to 80% are returned in the response. You
   can change this value by specifying the SimilarityThreshold parameter.



   CompareFaces also returns an array of faces that don't match the source image. For each face, it
   returns a bounding box, confidence value, landmarks, pose details, and quality. The response also returns
   information about the face in the source image, including the bounding box of the face and confidence value.


   If the image doesn't contain Exif metadata, CompareFaces returns orientation information for the
   source and target images. Use these values to display the images with the correct image orientation.


   If no faces are detected in the source or target images, CompareFaces returns an
   InvalidParameterException error.



   This is a stateless API operation. That is, data returned by this operation doesn't persist.



   For an example, see Comparing Faces in Images in the Amazon Rekognition Developer Guide.


   This operation requires permissions to perform the rekognition:CompareFaces action.

  compare-faces-request - `com.amazonaws.services.rekognition.model.CompareFacesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CompareFaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.CompareFacesResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.CompareFacesRequest compare-faces-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.compareFacesAsync compare-faces-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.CompareFacesRequest compare-faces-request]
    (-> this (.compareFacesAsync compare-faces-request))))

(defn list-collections-async
  "Returns list of collection IDs in your account. If the result is truncated, the response also provides a
   NextToken that you can use in the subsequent request to fetch the next set of collection IDs.


   For an example, see Listing Collections in the Amazon Rekognition Developer Guide.


   This operation requires permissions to perform the rekognition:ListCollections action.

  list-collections-request - `com.amazonaws.services.rekognition.model.ListCollectionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCollections operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.ListCollectionsResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.ListCollectionsRequest list-collections-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCollectionsAsync list-collections-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.ListCollectionsRequest list-collections-request]
    (-> this (.listCollectionsAsync list-collections-request))))

(defn start-celebrity-recognition-async
  "Starts asynchronous recognition of celebrities in a stored video.


   Amazon Rekognition Video can detect celebrities in a video must be stored in an Amazon S3 bucket. Use
   Video to specify the bucket name and the filename of the video. StartCelebrityRecognition
   returns a job identifier (JobId) which you use to get the results of the analysis. When celebrity
   recognition analysis is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple
   Notification Service topic that you specify in NotificationChannel. To get the results of the
   celebrity recognition analysis, first check that the status value published to the Amazon SNS topic is
   SUCCEEDED. If so, call GetCelebrityRecognition and pass the job identifier (
   JobId) from the initial call to StartCelebrityRecognition.


   For more information, see Recognizing Celebrities in the Amazon Rekognition Developer Guide.

  start-celebrity-recognition-request - `com.amazonaws.services.rekognition.model.StartCelebrityRecognitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartCelebrityRecognition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.StartCelebrityRecognitionResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartCelebrityRecognitionRequest start-celebrity-recognition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startCelebrityRecognitionAsync start-celebrity-recognition-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartCelebrityRecognitionRequest start-celebrity-recognition-request]
    (-> this (.startCelebrityRecognitionAsync start-celebrity-recognition-request))))

(defn get-celebrity-recognition-async
  "Gets the celebrity recognition results for a Amazon Rekognition Video analysis started by
   StartCelebrityRecognition.


   Celebrity recognition in a video is an asynchronous operation. Analysis is started by a call to
   StartCelebrityRecognition which returns a job identifier (JobId). When the celebrity
   recognition operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple
   Notification Service topic registered in the initial call to StartCelebrityRecognition. To get the
   results of the celebrity recognition analysis, first check that the status value published to the Amazon SNS
   topic is SUCCEEDED. If so, call GetCelebrityDetection and pass the job identifier (
   JobId) from the initial call to StartCelebrityDetection.


   For more information, see Working With Stored Videos in the Amazon Rekognition Developer Guide.


   GetCelebrityRecognition returns detected celebrities and the time(s) they are detected in an array (
   Celebrities) of CelebrityRecognition objects. Each CelebrityRecognition contains
   information about the celebrity in a CelebrityDetail object and the time, Timestamp, the
   celebrity was detected.



   GetCelebrityRecognition only returns the default facial attributes (BoundingBox,
   Confidence, Landmarks, Pose, and Quality). The other facial
   attributes listed in the Face object of the following response syntax are not returned. For more
   information, see FaceDetail in the Amazon Rekognition Developer Guide.



   By default, the Celebrities array is sorted by time (milliseconds from the start of the video). You
   can also sort the array by celebrity by specifying the value ID in the SortBy input
   parameter.


   The CelebrityDetail object includes the celebrity identifer and additional information urls. If you
   don't store the additional information urls, you can get them later by calling GetCelebrityInfo with the
   celebrity identifer.


   No information is returned for faces not recognized as celebrities.


   Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in
   MaxResults, the value of NextToken in the operation response contains a pagination
   token for getting the next set of results. To get the next page of results, call
   GetCelebrityDetection and populate the NextToken request parameter with the token value
   returned from the previous call to GetCelebrityRecognition.

  get-celebrity-recognition-request - `com.amazonaws.services.rekognition.model.GetCelebrityRecognitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCelebrityRecognition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.GetCelebrityRecognitionResult>`"
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetCelebrityRecognitionRequest get-celebrity-recognition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCelebrityRecognitionAsync get-celebrity-recognition-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetCelebrityRecognitionRequest get-celebrity-recognition-request]
    (-> this (.getCelebrityRecognitionAsync get-celebrity-recognition-request))))

