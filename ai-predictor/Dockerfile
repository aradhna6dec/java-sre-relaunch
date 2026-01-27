FROM python:3.9-slim
WORKDIR /app
RUN pip install kafka-python
COPY predictor.py .
CMD ["python", "predictor.py"]