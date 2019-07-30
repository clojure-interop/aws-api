(ns com.amazonaws.services.signer.AWSsigner
  "Interface for accessing signer.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSsigner instead.



  You can use Code Signing for Amazon FreeRTOS (AWS Signer) to sign code that you created for any of the IoT devices
  that Amazon Web Services supports. AWS Signer is integrated with Amazon FreeRTOS, AWS Certificate Manager, and AWS
  CloudTrail. Amazon FreeRTOS customers can use AWS Signer to sign code images before making them available for
  microcontrollers. You can use ACM to import third-party certificates to be used by AWS Signer. For general
  information about using AWS Signer, see the Code Signing for Amazon FreeRTOS
  Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.signer AWSsigner]))

(defn start-signing-job
  "Initiates a signing job to be performed on the code provided. Signing jobs are viewable by the
   ListSigningJobs operation for two years after they are performed. Note the following requirements:




   You must create an Amazon S3 source bucket. For more information, see Create a Bucket in the Amazon
   S3 Getting Started Guide.




   Your S3 source bucket must be version enabled.




   You must create an S3 destination bucket. AWS Signer uses your S3 destination bucket to write your signed code.




   You specify the name of the source and destination buckets when calling the StartSigningJob
   operation.




   You must also specify a request token that identifies your request to AWS Signer.




   You can call the DescribeSigningJob and the ListSigningJobs actions after you call
   StartSigningJob.


   For a Java example that shows how to use this action, see http://docs.aws.amazon.com/acm/latest/userguide/

  start-signing-job-request - `com.amazonaws.services.signer.model.StartSigningJobRequest`

  returns: Result of the StartSigningJob operation returned by the service. - `com.amazonaws.services.signer.model.StartSigningJobResult`

  throws: com.amazonaws.services.signer.model.ValidationException - You signing certificate could not be validated."
  (^com.amazonaws.services.signer.model.StartSigningJobResult [^AWSsigner this ^com.amazonaws.services.signer.model.StartSigningJobRequest start-signing-job-request]
    (-> this (.startSigningJob start-signing-job-request))))

(defn waiters
  "returns: `com.amazonaws.services.signer.waiters.AWSsignerWaiters`"
  (^com.amazonaws.services.signer.waiters.AWSsignerWaiters [^AWSsigner this]
    (-> this (.waiters))))

(defn get-signing-profile
  "Returns information on a specific signing profile.

  get-signing-profile-request - `com.amazonaws.services.signer.model.GetSigningProfileRequest`

  returns: Result of the GetSigningProfile operation returned by the service. - `com.amazonaws.services.signer.model.GetSigningProfileResult`

  throws: com.amazonaws.services.signer.model.ResourceNotFoundException - A specified resource could not be found."
  (^com.amazonaws.services.signer.model.GetSigningProfileResult [^AWSsigner this ^com.amazonaws.services.signer.model.GetSigningProfileRequest get-signing-profile-request]
    (-> this (.getSigningProfile get-signing-profile-request))))

(defn put-signing-profile
  "Creates a signing profile. A signing profile is an AWS Signer template that can be used to carry out a
   pre-defined signing job. For more information, see http://docs.aws.amazon.com/signer/latest/developerguide/gs-profile.html

  put-signing-profile-request - `com.amazonaws.services.signer.model.PutSigningProfileRequest`

  returns: Result of the PutSigningProfile operation returned by the service. - `com.amazonaws.services.signer.model.PutSigningProfileResult`

  throws: com.amazonaws.services.signer.model.ResourceNotFoundException - A specified resource could not be found."
  (^com.amazonaws.services.signer.model.PutSigningProfileResult [^AWSsigner this ^com.amazonaws.services.signer.model.PutSigningProfileRequest put-signing-profile-request]
    (-> this (.putSigningProfile put-signing-profile-request))))

(defn describe-signing-job
  "Returns information about a specific code signing job. You specify the job by using the jobId value
   that is returned by the StartSigningJob operation.

  describe-signing-job-request - `com.amazonaws.services.signer.model.DescribeSigningJobRequest`

  returns: Result of the DescribeSigningJob operation returned by the service. - `com.amazonaws.services.signer.model.DescribeSigningJobResult`

  throws: com.amazonaws.services.signer.model.ResourceNotFoundException - A specified resource could not be found."
  (^com.amazonaws.services.signer.model.DescribeSigningJobResult [^AWSsigner this ^com.amazonaws.services.signer.model.DescribeSigningJobRequest describe-signing-job-request]
    (-> this (.describeSigningJob describe-signing-job-request))))

(defn list-signing-profiles
  "Lists all available signing profiles in your AWS account. Returns only profiles with an ACTIVE
   status unless the includeCanceled request field is set to true. If additional jobs
   remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to
   ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs
   with your maxResults parameter and with new values that AWS Signer returns in the
   nextToken parameter until all of your signing jobs have been returned.

  list-signing-profiles-request - `com.amazonaws.services.signer.model.ListSigningProfilesRequest`

  returns: Result of the ListSigningProfiles operation returned by the service. - `com.amazonaws.services.signer.model.ListSigningProfilesResult`

  throws: com.amazonaws.services.signer.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.signer.model.ListSigningProfilesResult [^AWSsigner this ^com.amazonaws.services.signer.model.ListSigningProfilesRequest list-signing-profiles-request]
    (-> this (.listSigningProfiles list-signing-profiles-request))))

(defn list-signing-jobs
  "Lists all your signing jobs. You can use the maxResults parameter to limit the number of signing
   jobs that are returned in the response. If additional jobs remain to be listed, AWS Signer returns a
   nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the
   remaining values. You can continue calling ListSigningJobs with your maxResults
   parameter and with new values that AWS Signer returns in the nextToken parameter until all of your
   signing jobs have been returned.

  list-signing-jobs-request - `com.amazonaws.services.signer.model.ListSigningJobsRequest`

  returns: Result of the ListSigningJobs operation returned by the service. - `com.amazonaws.services.signer.model.ListSigningJobsResult`

  throws: com.amazonaws.services.signer.model.ValidationException - You signing certificate could not be validated."
  (^com.amazonaws.services.signer.model.ListSigningJobsResult [^AWSsigner this ^com.amazonaws.services.signer.model.ListSigningJobsRequest list-signing-jobs-request]
    (-> this (.listSigningJobs list-signing-jobs-request))))

(defn list-signing-platforms
  "Lists all signing platforms available in AWS Signer that match the request parameters. If additional jobs remain
   to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to
   ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs
   with your maxResults parameter and with new values that AWS Signer returns in the
   nextToken parameter until all of your signing jobs have been returned.

  list-signing-platforms-request - `com.amazonaws.services.signer.model.ListSigningPlatformsRequest`

  returns: Result of the ListSigningPlatforms operation returned by the service. - `com.amazonaws.services.signer.model.ListSigningPlatformsResult`

  throws: com.amazonaws.services.signer.model.ValidationException - You signing certificate could not be validated."
  (^com.amazonaws.services.signer.model.ListSigningPlatformsResult [^AWSsigner this ^com.amazonaws.services.signer.model.ListSigningPlatformsRequest list-signing-platforms-request]
    (-> this (.listSigningPlatforms list-signing-platforms-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSsigner this]
    (-> this (.shutdown))))

(defn get-signing-platform
  "Returns information on a specific signing platform.

  get-signing-platform-request - `com.amazonaws.services.signer.model.GetSigningPlatformRequest`

  returns: Result of the GetSigningPlatform operation returned by the service. - `com.amazonaws.services.signer.model.GetSigningPlatformResult`

  throws: com.amazonaws.services.signer.model.ResourceNotFoundException - A specified resource could not be found."
  (^com.amazonaws.services.signer.model.GetSigningPlatformResult [^AWSsigner this ^com.amazonaws.services.signer.model.GetSigningPlatformRequest get-signing-platform-request]
    (-> this (.getSigningPlatform get-signing-platform-request))))

(defn cancel-signing-profile
  "Changes the state of an ACTIVE signing profile to CANCELED. A canceled profile is still
   viewable with the ListSigningProfiles operation, but it cannot perform new signing jobs, and is
   deleted two years after cancelation.

  cancel-signing-profile-request - `com.amazonaws.services.signer.model.CancelSigningProfileRequest`

  returns: Result of the CancelSigningProfile operation returned by the service. - `com.amazonaws.services.signer.model.CancelSigningProfileResult`

  throws: com.amazonaws.services.signer.model.ResourceNotFoundException - A specified resource could not be found."
  (^com.amazonaws.services.signer.model.CancelSigningProfileResult [^AWSsigner this ^com.amazonaws.services.signer.model.CancelSigningProfileRequest cancel-signing-profile-request]
    (-> this (.cancelSigningProfile cancel-signing-profile-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSsigner this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

