(ns com.amazonaws.services.rekognition.AbstractAmazonRekognition
  "Abstract implementation of AmazonRekognition. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.rekognition AbstractAmazonRekognition]))

(defn delete-faces
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.DeleteFacesRequest`

  returns: Result of the DeleteFaces operation returned by the service. - `com.amazonaws.services.rekognition.model.DeleteFacesResult`"
  (^com.amazonaws.services.rekognition.model.DeleteFacesResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.DeleteFacesRequest request]
    (-> this (.deleteFaces request))))

(defn create-collection
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.CreateCollectionRequest`

  returns: Result of the CreateCollection operation returned by the service. - `com.amazonaws.services.rekognition.model.CreateCollectionResult`"
  (^com.amazonaws.services.rekognition.model.CreateCollectionResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.CreateCollectionRequest request]
    (-> this (.createCollection request))))

(defn start-face-search
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.StartFaceSearchRequest`

  returns: Result of the StartFaceSearch operation returned by the service. - `com.amazonaws.services.rekognition.model.StartFaceSearchResult`"
  (^com.amazonaws.services.rekognition.model.StartFaceSearchResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.StartFaceSearchRequest request]
    (-> this (.startFaceSearch request))))

(defn set-region
  "Description copied from interface: AmazonRekognition

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonRekognition this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn index-faces
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.IndexFacesRequest`

  returns: Result of the IndexFaces operation returned by the service. - `com.amazonaws.services.rekognition.model.IndexFacesResult`"
  (^com.amazonaws.services.rekognition.model.IndexFacesResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.IndexFacesRequest request]
    (-> this (.indexFaces request))))

(defn start-celebrity-recognition
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.StartCelebrityRecognitionRequest`

  returns: Result of the StartCelebrityRecognition operation returned by the service. - `com.amazonaws.services.rekognition.model.StartCelebrityRecognitionResult`"
  (^com.amazonaws.services.rekognition.model.StartCelebrityRecognitionResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.StartCelebrityRecognitionRequest request]
    (-> this (.startCelebrityRecognition request))))

(defn delete-collection
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.DeleteCollectionRequest`

  returns: Result of the DeleteCollection operation returned by the service. - `com.amazonaws.services.rekognition.model.DeleteCollectionResult`"
  (^com.amazonaws.services.rekognition.model.DeleteCollectionResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.DeleteCollectionRequest request]
    (-> this (.deleteCollection request))))

(defn stop-stream-processor
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.StopStreamProcessorRequest`

  returns: Result of the StopStreamProcessor operation returned by the service. - `com.amazonaws.services.rekognition.model.StopStreamProcessorResult`"
  (^com.amazonaws.services.rekognition.model.StopStreamProcessorResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.StopStreamProcessorRequest request]
    (-> this (.stopStreamProcessor request))))

(defn detect-moderation-labels
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.DetectModerationLabelsRequest`

  returns: Result of the DetectModerationLabels operation returned by the service. - `com.amazonaws.services.rekognition.model.DetectModerationLabelsResult`"
  (^com.amazonaws.services.rekognition.model.DetectModerationLabelsResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.DetectModerationLabelsRequest request]
    (-> this (.detectModerationLabels request))))

(defn start-content-moderation
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.StartContentModerationRequest`

  returns: Result of the StartContentModeration operation returned by the service. - `com.amazonaws.services.rekognition.model.StartContentModerationResult`"
  (^com.amazonaws.services.rekognition.model.StartContentModerationResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.StartContentModerationRequest request]
    (-> this (.startContentModeration request))))

(defn list-faces
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.ListFacesRequest`

  returns: Result of the ListFaces operation returned by the service. - `com.amazonaws.services.rekognition.model.ListFacesResult`"
  (^com.amazonaws.services.rekognition.model.ListFacesResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.ListFacesRequest request]
    (-> this (.listFaces request))))

(defn get-face-search
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.GetFaceSearchRequest`

  returns: Result of the GetFaceSearch operation returned by the service. - `com.amazonaws.services.rekognition.model.GetFaceSearchResult`"
  (^com.amazonaws.services.rekognition.model.GetFaceSearchResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.GetFaceSearchRequest request]
    (-> this (.getFaceSearch request))))

(defn get-celebrity-recognition
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.GetCelebrityRecognitionRequest`

  returns: Result of the GetCelebrityRecognition operation returned by the service. - `com.amazonaws.services.rekognition.model.GetCelebrityRecognitionResult`"
  (^com.amazonaws.services.rekognition.model.GetCelebrityRecognitionResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.GetCelebrityRecognitionRequest request]
    (-> this (.getCelebrityRecognition request))))

(defn compare-faces
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.CompareFacesRequest`

  returns: Result of the CompareFaces operation returned by the service. - `com.amazonaws.services.rekognition.model.CompareFacesResult`"
  (^com.amazonaws.services.rekognition.model.CompareFacesResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.CompareFacesRequest request]
    (-> this (.compareFaces request))))

(defn describe-stream-processor
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.DescribeStreamProcessorRequest`

  returns: Result of the DescribeStreamProcessor operation returned by the service. - `com.amazonaws.services.rekognition.model.DescribeStreamProcessorResult`"
  (^com.amazonaws.services.rekognition.model.DescribeStreamProcessorResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.DescribeStreamProcessorRequest request]
    (-> this (.describeStreamProcessor request))))

(defn start-stream-processor
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.StartStreamProcessorRequest`

  returns: Result of the StartStreamProcessor operation returned by the service. - `com.amazonaws.services.rekognition.model.StartStreamProcessorResult`"
  (^com.amazonaws.services.rekognition.model.StartStreamProcessorResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.StartStreamProcessorRequest request]
    (-> this (.startStreamProcessor request))))

(defn create-stream-processor
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.CreateStreamProcessorRequest`

  returns: Result of the CreateStreamProcessor operation returned by the service. - `com.amazonaws.services.rekognition.model.CreateStreamProcessorResult`"
  (^com.amazonaws.services.rekognition.model.CreateStreamProcessorResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.CreateStreamProcessorRequest request]
    (-> this (.createStreamProcessor request))))

(defn get-celebrity-info
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.GetCelebrityInfoRequest`

  returns: Result of the GetCelebrityInfo operation returned by the service. - `com.amazonaws.services.rekognition.model.GetCelebrityInfoResult`"
  (^com.amazonaws.services.rekognition.model.GetCelebrityInfoResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.GetCelebrityInfoRequest request]
    (-> this (.getCelebrityInfo request))))

(defn shutdown
  "Description copied from interface: AmazonRekognition"
  ([^AbstractAmazonRekognition this]
    (-> this (.shutdown))))

(defn start-person-tracking
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.StartPersonTrackingRequest`

  returns: Result of the StartPersonTracking operation returned by the service. - `com.amazonaws.services.rekognition.model.StartPersonTrackingResult`"
  (^com.amazonaws.services.rekognition.model.StartPersonTrackingResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.StartPersonTrackingRequest request]
    (-> this (.startPersonTracking request))))

(defn set-endpoint
  "Description copied from interface: AmazonRekognition

  endpoint - The endpoint (ex: \"rekognition.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"rekognition.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonRekognition this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-label-detection
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.GetLabelDetectionRequest`

  returns: Result of the GetLabelDetection operation returned by the service. - `com.amazonaws.services.rekognition.model.GetLabelDetectionResult`"
  (^com.amazonaws.services.rekognition.model.GetLabelDetectionResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.GetLabelDetectionRequest request]
    (-> this (.getLabelDetection request))))

(defn detect-faces
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.DetectFacesRequest`

  returns: Result of the DetectFaces operation returned by the service. - `com.amazonaws.services.rekognition.model.DetectFacesResult`"
  (^com.amazonaws.services.rekognition.model.DetectFacesResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.DetectFacesRequest request]
    (-> this (.detectFaces request))))

(defn start-face-detection
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.StartFaceDetectionRequest`

  returns: Result of the StartFaceDetection operation returned by the service. - `com.amazonaws.services.rekognition.model.StartFaceDetectionResult`"
  (^com.amazonaws.services.rekognition.model.StartFaceDetectionResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.StartFaceDetectionRequest request]
    (-> this (.startFaceDetection request))))

(defn delete-stream-processor
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.DeleteStreamProcessorRequest`

  returns: Result of the DeleteStreamProcessor operation returned by the service. - `com.amazonaws.services.rekognition.model.DeleteStreamProcessorResult`"
  (^com.amazonaws.services.rekognition.model.DeleteStreamProcessorResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.DeleteStreamProcessorRequest request]
    (-> this (.deleteStreamProcessor request))))

(defn list-collections
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.ListCollectionsRequest`

  returns: Result of the ListCollections operation returned by the service. - `com.amazonaws.services.rekognition.model.ListCollectionsResult`"
  (^com.amazonaws.services.rekognition.model.ListCollectionsResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.ListCollectionsRequest request]
    (-> this (.listCollections request))))

(defn list-stream-processors
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.ListStreamProcessorsRequest`

  returns: Result of the ListStreamProcessors operation returned by the service. - `com.amazonaws.services.rekognition.model.ListStreamProcessorsResult`"
  (^com.amazonaws.services.rekognition.model.ListStreamProcessorsResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.ListStreamProcessorsRequest request]
    (-> this (.listStreamProcessors request))))

(defn get-content-moderation
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.GetContentModerationRequest`

  returns: Result of the GetContentModeration operation returned by the service. - `com.amazonaws.services.rekognition.model.GetContentModerationResult`"
  (^com.amazonaws.services.rekognition.model.GetContentModerationResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.GetContentModerationRequest request]
    (-> this (.getContentModeration request))))

(defn search-faces
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.SearchFacesRequest`

  returns: Result of the SearchFaces operation returned by the service. - `com.amazonaws.services.rekognition.model.SearchFacesResult`"
  (^com.amazonaws.services.rekognition.model.SearchFacesResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.SearchFacesRequest request]
    (-> this (.searchFaces request))))

(defn get-person-tracking
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.GetPersonTrackingRequest`

  returns: Result of the GetPersonTracking operation returned by the service. - `com.amazonaws.services.rekognition.model.GetPersonTrackingResult`"
  (^com.amazonaws.services.rekognition.model.GetPersonTrackingResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.GetPersonTrackingRequest request]
    (-> this (.getPersonTracking request))))

(defn search-faces-by-image
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.SearchFacesByImageRequest`

  returns: Result of the SearchFacesByImage operation returned by the service. - `com.amazonaws.services.rekognition.model.SearchFacesByImageResult`"
  (^com.amazonaws.services.rekognition.model.SearchFacesByImageResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.SearchFacesByImageRequest request]
    (-> this (.searchFacesByImage request))))

(defn detect-text
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.DetectTextRequest`

  returns: Result of the DetectText operation returned by the service. - `com.amazonaws.services.rekognition.model.DetectTextResult`"
  (^com.amazonaws.services.rekognition.model.DetectTextResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.DetectTextRequest request]
    (-> this (.detectText request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonRekognition

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonRekognition this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn start-label-detection
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.StartLabelDetectionRequest`

  returns: Result of the StartLabelDetection operation returned by the service. - `com.amazonaws.services.rekognition.model.StartLabelDetectionResult`"
  (^com.amazonaws.services.rekognition.model.StartLabelDetectionResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.StartLabelDetectionRequest request]
    (-> this (.startLabelDetection request))))

(defn get-face-detection
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.GetFaceDetectionRequest`

  returns: Result of the GetFaceDetection operation returned by the service. - `com.amazonaws.services.rekognition.model.GetFaceDetectionResult`"
  (^com.amazonaws.services.rekognition.model.GetFaceDetectionResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.GetFaceDetectionRequest request]
    (-> this (.getFaceDetection request))))

(defn describe-collection
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.DescribeCollectionRequest`

  returns: Result of the DescribeCollection operation returned by the service. - `com.amazonaws.services.rekognition.model.DescribeCollectionResult`"
  (^com.amazonaws.services.rekognition.model.DescribeCollectionResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.DescribeCollectionRequest request]
    (-> this (.describeCollection request))))

(defn detect-labels
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.DetectLabelsRequest`

  returns: Result of the DetectLabels operation returned by the service. - `com.amazonaws.services.rekognition.model.DetectLabelsResult`"
  (^com.amazonaws.services.rekognition.model.DetectLabelsResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.DetectLabelsRequest request]
    (-> this (.detectLabels request))))

(defn recognize-celebrities
  "Description copied from interface: AmazonRekognition

  request - `com.amazonaws.services.rekognition.model.RecognizeCelebritiesRequest`

  returns: Result of the RecognizeCelebrities operation returned by the service. - `com.amazonaws.services.rekognition.model.RecognizeCelebritiesResult`"
  (^com.amazonaws.services.rekognition.model.RecognizeCelebritiesResult [^AbstractAmazonRekognition this ^com.amazonaws.services.rekognition.model.RecognizeCelebritiesRequest request]
    (-> this (.recognizeCelebrities request))))

