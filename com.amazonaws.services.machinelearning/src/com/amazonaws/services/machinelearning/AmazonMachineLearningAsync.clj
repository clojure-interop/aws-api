(ns com.amazonaws.services.machinelearning.AmazonMachineLearningAsync
  "Interface for accessing Amazon Machine Learning asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonMachineLearningAsync instead.


  Definition of the public APIs exposed by Amazon Machine Learning"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.machinelearning AmazonMachineLearningAsync]))

(defn create-realtime-endpoint-async
  "Creates a real-time endpoint for the MLModel. The endpoint contains the URI of the
   MLModel; that is, the location to send real-time prediction requests for the specified
   MLModel.

  create-realtime-endpoint-request - `com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRealtimeEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointRequest create-realtime-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRealtimeEndpointAsync create-realtime-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointRequest create-realtime-endpoint-request]
    (-> this (.createRealtimeEndpointAsync create-realtime-endpoint-request))))

(defn create-ml-model-async
  "Creates a new MLModel using the DataSource and the recipe as information sources.


   An MLModel is nearly immutable. Users can update only the MLModelName and the
   ScoreThreshold in an MLModel without creating a new MLModel.


   CreateMLModel is an asynchronous operation. In response to CreateMLModel, Amazon
   Machine Learning (Amazon ML) immediately returns and sets the MLModel status to PENDING
   . After the MLModel has been created and ready is for use, Amazon ML sets the status to
   COMPLETED.


   You can use the GetMLModel operation to check the progress of the MLModel during the
   creation operation.


   CreateMLModel requires a DataSource with computed statistics, which can be created by
   setting ComputeStatistics to true in CreateDataSourceFromRDS,
   CreateDataSourceFromS3, or CreateDataSourceFromRedshift operations.

  create-ml-model-request - `com.amazonaws.services.machinelearning.model.CreateMLModelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateMLModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.CreateMLModelResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.CreateMLModelRequest create-ml-model-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createMLModelAsync create-ml-model-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.CreateMLModelRequest create-ml-model-request]
    (-> this (.createMLModelAsync create-ml-model-request))))

(defn predict-async
  "Generates a prediction for the observation using the specified ML Model.

   Note

   Not all response parameters will be populated. Whether a response parameter is populated depends on the type of
   model requested.

  predict-request - `com.amazonaws.services.machinelearning.model.PredictRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Predict operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.PredictResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.PredictRequest predict-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.predictAsync predict-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.PredictRequest predict-request]
    (-> this (.predictAsync predict-request))))

(defn delete-evaluation-async
  "Assigns the DELETED status to an Evaluation, rendering it unusable.


   After invoking the DeleteEvaluation operation, you can use the GetEvaluation operation
   to verify that the status of the Evaluation changed to DELETED.

   Caution

   The results of the DeleteEvaluation operation are irreversible.

  delete-evaluation-request - `com.amazonaws.services.machinelearning.model.DeleteEvaluationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEvaluation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.DeleteEvaluationResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.DeleteEvaluationRequest delete-evaluation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEvaluationAsync delete-evaluation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.DeleteEvaluationRequest delete-evaluation-request]
    (-> this (.deleteEvaluationAsync delete-evaluation-request))))

(defn create-data-source-from-rds-async
  "Creates a DataSource object from an  Amazon Relational Database
   Service (Amazon RDS). A DataSource references data that can be used to perform
   CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations.


   CreateDataSourceFromRDS is an asynchronous operation. In response to
   CreateDataSourceFromRDS, Amazon Machine Learning (Amazon ML) immediately returns and sets the
   DataSource status to PENDING. After the DataSource is created and ready
   for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in
   the COMPLETED or PENDING state can be used only to perform
   >CreateMLModel>, CreateEvaluation, or CreateBatchPrediction
   operations.


   If Amazon ML cannot accept the input source, it sets the Status parameter to FAILED and
   includes an error message in the Message attribute of the GetDataSource operation
   response.

  create-data-source-from-rds-request - `com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDataSourceFromRDS operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSRequest create-data-source-from-rds-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDataSourceFromRDSAsync create-data-source-from-rds-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSRequest create-data-source-from-rds-request]
    (-> this (.createDataSourceFromRDSAsync create-data-source-from-rds-request))))

(defn delete-tags-async
  "Deletes the specified tags associated with an ML object. After this operation is complete, you can't recover
   deleted tags.


   If you specify a tag that doesn't exist, Amazon ML ignores it.

  delete-tags-request - `com.amazonaws.services.machinelearning.model.DeleteTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.DeleteTagsResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.DeleteTagsRequest delete-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTagsAsync delete-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.DeleteTagsRequest delete-tags-request]
    (-> this (.deleteTagsAsync delete-tags-request))))

(defn get-batch-prediction-async
  "Returns a BatchPrediction that includes detailed metadata, status, and data file information for a
   Batch Prediction request.

  get-batch-prediction-request - `com.amazonaws.services.machinelearning.model.GetBatchPredictionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBatchPrediction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.GetBatchPredictionResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.GetBatchPredictionRequest get-batch-prediction-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBatchPredictionAsync get-batch-prediction-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.GetBatchPredictionRequest get-batch-prediction-request]
    (-> this (.getBatchPredictionAsync get-batch-prediction-request))))

(defn get-evaluation-async
  "Returns an Evaluation that includes metadata as well as the current status of the
   Evaluation.

  get-evaluation-request - `com.amazonaws.services.machinelearning.model.GetEvaluationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEvaluation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.GetEvaluationResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.GetEvaluationRequest get-evaluation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEvaluationAsync get-evaluation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.GetEvaluationRequest get-evaluation-request]
    (-> this (.getEvaluationAsync get-evaluation-request))))

(defn create-data-source-from-s-3-async
  "Creates a DataSource object. A DataSource references data that can be used to perform
   CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations.


   CreateDataSourceFromS3 is an asynchronous operation. In response to
   CreateDataSourceFromS3, Amazon Machine Learning (Amazon ML) immediately returns and sets the
   DataSource status to PENDING. After the DataSource has been created and is
   ready for use, Amazon ML sets the Status parameter to COMPLETED.
   DataSource in the COMPLETED or PENDING state can be used to perform only
   CreateMLModel, CreateEvaluation or CreateBatchPrediction operations.


   If Amazon ML can't accept the input source, it sets the Status parameter to FAILED and
   includes an error message in the Message attribute of the GetDataSource operation
   response.


   The observation data used in a DataSource should be ready to use; that is, it should have a
   consistent structure, and missing data values should be kept to a minimum. The observation data must reside in
   one or more .csv files in an Amazon Simple Storage Service (Amazon S3) location, along with a schema that
   describes the data items by name and type. The same schema must be used for all of the data files referenced by
   the DataSource.


   After the DataSource has been created, it's ready to use in evaluations and batch predictions. If
   you plan to use the DataSource to train an MLModel, the DataSource also
   needs a recipe. A recipe describes how each input variable will be used in training an MLModel. Will
   the variable be included or excluded from training? Will the variable be manipulated; for example, will it be
   combined with another variable or will it be split apart into word combinations? The recipe provides answers to
   these questions.

  create-data-source-from-s-3-request - `com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Request`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDataSourceFromS3 operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Result>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Request create-data-source-from-s-3-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDataSourceFromS3Async create-data-source-from-s-3-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Request create-data-source-from-s-3-request]
    (-> this (.createDataSourceFromS3Async create-data-source-from-s-3-request))))

(defn update-ml-model-async
  "Updates the MLModelName and the ScoreThreshold of an MLModel.


   You can use the GetMLModel operation to view the contents of the updated data element.

  update-ml-model-request - `com.amazonaws.services.machinelearning.model.UpdateMLModelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateMLModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.UpdateMLModelResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.UpdateMLModelRequest update-ml-model-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateMLModelAsync update-ml-model-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.UpdateMLModelRequest update-ml-model-request]
    (-> this (.updateMLModelAsync update-ml-model-request))))

(defn get-ml-model-async
  "Returns an MLModel that includes detailed metadata, data source information, and the current status
   of the MLModel.


   GetMLModel provides results in normal or verbose format.

  get-ml-model-request - `com.amazonaws.services.machinelearning.model.GetMLModelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMLModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.GetMLModelResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.GetMLModelRequest get-ml-model-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMLModelAsync get-ml-model-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.GetMLModelRequest get-ml-model-request]
    (-> this (.getMLModelAsync get-ml-model-request))))

(defn create-batch-prediction-async
  "Generates predictions for a group of observations. The observations to process exist in one or more data files
   referenced by a DataSource. This operation creates a new BatchPrediction, and uses an
   MLModel and the data files referenced by the DataSource as information sources.


   CreateBatchPrediction is an asynchronous operation. In response to
   CreateBatchPrediction, Amazon Machine Learning (Amazon ML) immediately returns and sets the
   BatchPrediction status to PENDING. After the BatchPrediction completes,
   Amazon ML sets the status to COMPLETED.


   You can poll for status updates by using the GetBatchPrediction operation and checking the
   Status parameter of the result. After the COMPLETED status appears, the results are
   available in the location specified by the OutputUri parameter.

  create-batch-prediction-request - `com.amazonaws.services.machinelearning.model.CreateBatchPredictionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBatchPrediction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.CreateBatchPredictionResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.CreateBatchPredictionRequest create-batch-prediction-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBatchPredictionAsync create-batch-prediction-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.CreateBatchPredictionRequest create-batch-prediction-request]
    (-> this (.createBatchPredictionAsync create-batch-prediction-request))))

(defn delete-ml-model-async
  "Assigns the DELETED status to an MLModel, rendering it unusable.


   After using the DeleteMLModel operation, you can use the GetMLModel operation to verify
   that the status of the MLModel changed to DELETED.


   Caution: The result of the DeleteMLModel operation is irreversible.

  delete-ml-model-request - `com.amazonaws.services.machinelearning.model.DeleteMLModelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMLModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.DeleteMLModelResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.DeleteMLModelRequest delete-ml-model-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMLModelAsync delete-ml-model-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.DeleteMLModelRequest delete-ml-model-request]
    (-> this (.deleteMLModelAsync delete-ml-model-request))))

(defn describe-batch-predictions-async
  "Returns a list of BatchPrediction operations that match the search criteria in the request.

  describe-batch-predictions-request - `com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBatchPredictions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsRequest describe-batch-predictions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBatchPredictionsAsync describe-batch-predictions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsRequest describe-batch-predictions-request]
    (-> this (.describeBatchPredictionsAsync describe-batch-predictions-request)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this]
    (-> this (.describeBatchPredictionsAsync))))

(defn create-evaluation-async
  "Creates a new Evaluation of an MLModel. An MLModel is evaluated on a set
   of observations associated to a DataSource. Like a DataSource for an
   MLModel, the DataSource for an Evaluation contains values for the
   Target Variable. The Evaluation compares the predicted result for each observation to
   the actual outcome and provides a summary so that you know how effective the MLModel functions on
   the test data. Evaluation generates a relevant performance metric, such as BinaryAUC, RegressionRMSE or
   MulticlassAvgFScore based on the corresponding MLModelType: BINARY,
   REGRESSION or MULTICLASS.


   CreateEvaluation is an asynchronous operation. In response to CreateEvaluation, Amazon
   Machine Learning (Amazon ML) immediately returns and sets the evaluation status to PENDING. After
   the Evaluation is created and ready for use, Amazon ML sets the status to COMPLETED.


   You can use the GetEvaluation operation to check progress of the evaluation during the creation
   operation.

  create-evaluation-request - `com.amazonaws.services.machinelearning.model.CreateEvaluationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEvaluation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.CreateEvaluationResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.CreateEvaluationRequest create-evaluation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEvaluationAsync create-evaluation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.CreateEvaluationRequest create-evaluation-request]
    (-> this (.createEvaluationAsync create-evaluation-request))))

(defn describe-evaluations-async
  "Returns a list of DescribeEvaluations that match the search criteria in the request.

  describe-evaluations-request - `com.amazonaws.services.machinelearning.model.DescribeEvaluationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEvaluations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.DescribeEvaluationsResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.DescribeEvaluationsRequest describe-evaluations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEvaluationsAsync describe-evaluations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.DescribeEvaluationsRequest describe-evaluations-request]
    (-> this (.describeEvaluationsAsync describe-evaluations-request)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this]
    (-> this (.describeEvaluationsAsync))))

(defn delete-batch-prediction-async
  "Assigns the DELETED status to a BatchPrediction, rendering it unusable.


   After using the DeleteBatchPrediction operation, you can use the GetBatchPrediction operation
   to verify that the status of the BatchPrediction changed to DELETED.


   Caution: The result of the DeleteBatchPrediction operation is irreversible.

  delete-batch-prediction-request - `com.amazonaws.services.machinelearning.model.DeleteBatchPredictionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBatchPrediction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.DeleteBatchPredictionResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.DeleteBatchPredictionRequest delete-batch-prediction-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBatchPredictionAsync delete-batch-prediction-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.DeleteBatchPredictionRequest delete-batch-prediction-request]
    (-> this (.deleteBatchPredictionAsync delete-batch-prediction-request))))

(defn update-evaluation-async
  "Updates the EvaluationName of an Evaluation.


   You can use the GetEvaluation operation to view the contents of the updated data element.

  update-evaluation-request - `com.amazonaws.services.machinelearning.model.UpdateEvaluationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEvaluation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.UpdateEvaluationResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.UpdateEvaluationRequest update-evaluation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEvaluationAsync update-evaluation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.UpdateEvaluationRequest update-evaluation-request]
    (-> this (.updateEvaluationAsync update-evaluation-request))))

(defn update-batch-prediction-async
  "Updates the BatchPredictionName of a BatchPrediction.


   You can use the GetBatchPrediction operation to view the contents of the updated data element.

  update-batch-prediction-request - `com.amazonaws.services.machinelearning.model.UpdateBatchPredictionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBatchPrediction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.UpdateBatchPredictionResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.UpdateBatchPredictionRequest update-batch-prediction-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBatchPredictionAsync update-batch-prediction-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.UpdateBatchPredictionRequest update-batch-prediction-request]
    (-> this (.updateBatchPredictionAsync update-batch-prediction-request))))

(defn update-data-source-async
  "Updates the DataSourceName of a DataSource.


   You can use the GetDataSource operation to view the contents of the updated data element.

  update-data-source-request - `com.amazonaws.services.machinelearning.model.UpdateDataSourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDataSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.UpdateDataSourceResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.UpdateDataSourceRequest update-data-source-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDataSourceAsync update-data-source-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.UpdateDataSourceRequest update-data-source-request]
    (-> this (.updateDataSourceAsync update-data-source-request))))

(defn create-data-source-from-redshift-async
  "Creates a DataSource from a database hosted on an Amazon Redshift cluster. A DataSource
   references data that can be used to perform either CreateMLModel, CreateEvaluation, or
   CreateBatchPrediction operations.


   CreateDataSourceFromRedshift is an asynchronous operation. In response to
   CreateDataSourceFromRedshift, Amazon Machine Learning (Amazon ML) immediately returns and sets the
   DataSource status to PENDING. After the DataSource is created and ready
   for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in
   COMPLETED or PENDING states can be used to perform only CreateMLModel,
   CreateEvaluation, or CreateBatchPrediction operations.


   If Amazon ML can't accept the input source, it sets the Status parameter to FAILED and
   includes an error message in the Message attribute of the GetDataSource operation
   response.


   The observations should be contained in the database hosted on an Amazon Redshift cluster and should be specified
   by a SelectSqlQuery query. Amazon ML executes an Unload command in Amazon Redshift to
   transfer the result set of the SelectSqlQuery query to S3StagingLocation.


   After the DataSource has been created, it's ready for use in evaluations and batch predictions. If
   you plan to use the DataSource to train an MLModel, the DataSource also
   requires a recipe. A recipe describes how each input variable will be used in training an MLModel.
   Will the variable be included or excluded from training? Will the variable be manipulated; for example, will it
   be combined with another variable or will it be split apart into word combinations? The recipe provides answers
   to these questions.

   ?oxy_insert_start author=\"laurama\" timestamp=\"20160406T153842-0700\"

   You can't change an existing datasource, but you can copy and modify the settings from an existing Amazon
   Redshift datasource to create a new datasource. To do so, call GetDataSource for an existing
   datasource and copy the values to a CreateDataSource call. Change the settings that you want to
   change and make sure that all required fields have the appropriate values.

   ?oxy_insert_end

  create-data-source-from-redshift-request - `com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDataSourceFromRedshift operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftRequest create-data-source-from-redshift-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDataSourceFromRedshiftAsync create-data-source-from-redshift-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftRequest create-data-source-from-redshift-request]
    (-> this (.createDataSourceFromRedshiftAsync create-data-source-from-redshift-request))))

(defn describe-ml-models-async
  "Returns a list of MLModel that match the search criteria in the request.

  describe-ml-models-request - `com.amazonaws.services.machinelearning.model.DescribeMLModelsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMLModels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.DescribeMLModelsResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.DescribeMLModelsRequest describe-ml-models-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMLModelsAsync describe-ml-models-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.DescribeMLModelsRequest describe-ml-models-request]
    (-> this (.describeMLModelsAsync describe-ml-models-request)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this]
    (-> this (.describeMLModelsAsync))))

(defn describe-tags-async
  "Describes one or more of the tags for your Amazon ML object.

  describe-tags-request - `com.amazonaws.services.machinelearning.model.DescribeTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.DescribeTagsResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.DescribeTagsRequest describe-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTagsAsync describe-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.DescribeTagsRequest describe-tags-request]
    (-> this (.describeTagsAsync describe-tags-request))))

(defn describe-data-sources-async
  "Returns a list of DataSource that match the search criteria in the request.

  describe-data-sources-request - `com.amazonaws.services.machinelearning.model.DescribeDataSourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDataSources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.DescribeDataSourcesResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.DescribeDataSourcesRequest describe-data-sources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDataSourcesAsync describe-data-sources-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.DescribeDataSourcesRequest describe-data-sources-request]
    (-> this (.describeDataSourcesAsync describe-data-sources-request)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this]
    (-> this (.describeDataSourcesAsync))))

(defn delete-realtime-endpoint-async
  "Deletes a real time endpoint of an MLModel.

  delete-realtime-endpoint-request - `com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRealtimeEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointRequest delete-realtime-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRealtimeEndpointAsync delete-realtime-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointRequest delete-realtime-endpoint-request]
    (-> this (.deleteRealtimeEndpointAsync delete-realtime-endpoint-request))))

(defn get-data-source-async
  "Returns a DataSource that includes metadata and data file information, as well as the current status
   of the DataSource.


   GetDataSource provides results in normal or verbose format. The verbose format adds the schema
   description and the list of files pointed to by the DataSource to the normal format.

  get-data-source-request - `com.amazonaws.services.machinelearning.model.GetDataSourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDataSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.GetDataSourceResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.GetDataSourceRequest get-data-source-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDataSourceAsync get-data-source-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.GetDataSourceRequest get-data-source-request]
    (-> this (.getDataSourceAsync get-data-source-request))))

(defn delete-data-source-async
  "Assigns the DELETED status to a DataSource, rendering it unusable.


   After using the DeleteDataSource operation, you can use the GetDataSource operation to verify
   that the status of the DataSource changed to DELETED.


   Caution: The results of the DeleteDataSource operation are irreversible.

  delete-data-source-request - `com.amazonaws.services.machinelearning.model.DeleteDataSourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDataSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.DeleteDataSourceResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.DeleteDataSourceRequest delete-data-source-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDataSourceAsync delete-data-source-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.DeleteDataSourceRequest delete-data-source-request]
    (-> this (.deleteDataSourceAsync delete-data-source-request))))

(defn add-tags-async
  "Adds one or more tags to an object, up to a limit of 10. Each tag consists of a key and an optional value. If you
   add a tag using a key that is already associated with the ML object, AddTags updates the tag's
   value.

  add-tags-request - `com.amazonaws.services.machinelearning.model.AddTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.machinelearning.model.AddTagsResult>`"
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.AddTagsRequest add-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsAsync add-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMachineLearningAsync this ^com.amazonaws.services.machinelearning.model.AddTagsRequest add-tags-request]
    (-> this (.addTagsAsync add-tags-request))))

