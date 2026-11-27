CREATE SEQUENCE customer_number_seq START 1001;

CREATE TABLE customer (
    id              BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    customer_number VARCHAR(12)  NOT NULL UNIQUE,
    name            VARCHAR(150) NOT NULL,
    mothers_name    VARCHAR(150) NOT NULL,
    birth_place     VARCHAR(100) NOT NULL,
    birth_date      DATE         NOT NULL,
    postal_code     VARCHAR(10)  NOT NULL,
    city            VARCHAR(100) NOT NULL,
    street          VARCHAR(200) NOT NULL,
    interests       VARCHAR(500),
    notes           TEXT,
    email           VARCHAR(254),
    phone           VARCHAR(30),
    tax_id          CHAR(10) UNIQUE,
    status          VARCHAR(20)  NOT NULL DEFAULT 'ACTIVE',
    kyc_status      VARCHAR(20)  NOT NULL DEFAULT 'PENDING',
    created_at      TIMESTAMPTZ  NOT NULL DEFAULT now(),
    updated_at      TIMESTAMPTZ  NOT NULL DEFAULT now(),
    version         BIGINT       NOT NULL DEFAULT 0
);

CREATE INDEX idx_customer_name ON customer (lower(name));
